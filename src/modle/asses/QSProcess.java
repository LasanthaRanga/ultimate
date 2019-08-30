package modle.asses;

import com.jfoenix.controls.JFXProgressBar;
import conn.DB;
import conn.NewHibernateUtil;
import javassist.bytecode.stackmap.BasicBlock;
import modle.GetInstans;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;


public class QSProcess {

    public static void main(String[] args){
    }


    static String getAll = "SELECT\n" +
            "assessment.idAssessment,\n" +
            "assessment.Customer_idCustomer,\n" +
            "assessment.Ward_idWard,\n" +
            "assessment.Street_idStreet,\n" +
            "assessment.ass_nature_idass_nature,\n" +
            "assessment.ass_discription_idass_discription,\n" +
            "assessment.User_idUser,\n" +
            "assessment.assessment_oder,\n" +
            "assessment.assessment_no,\n" +
            "assessment.assessment_status,\n" +
            "assessment.assessment_syn,\n" +
            "assessment.assessment_comment,\n" +
            "assessment.assessment_obsolete,\n" +
            "ass_nature.idass_nature,\n" +
            "ass_nature.ass_nature_name,\n" +
            "ass_nature.ass_nature_year_rate,\n" +
            "ass_nature.ass_nature_status,\n" +
            "ass_nature.ass_nature_warrant_rate,\n" +
            "ass_allocation.idass_allocation,\n" +
            "ass_allocation.ass_allocation,\n" +
            "ass_allocation.ass_allocation_status,\n" +
            "ass_allocation.Assessment_idAssessment,\n" +
            "ass_allocation.ass_allocation_change_date,\n" +
            "ass_allocation.ass_allocation_discription,\n" +
            "ass_allocation.ass_allocation_idUser\n" +
            "FROM\n" +
            "assessment\n" +
            "INNER JOIN ass_nature ON assessment.ass_nature_idass_nature = ass_nature.idass_nature\n" +
            "LEFT JOIN ass_allocation ON ass_allocation.Assessment_idAssessment = assessment.idAssessment\n" +
            "WHERE\n" +
            "ass_allocation.ass_allocation_status = 1 AND\n" +
            "assessment.assessment_syn = 0\n";

    static String getCount = "SELECT \n" +
            "COUNT(idAssessment)\n" +
            "FROM\n" +
            "assessment\n" +
            "INNER JOIN ass_nature ON assessment.ass_nature_idass_nature = ass_nature.idass_nature\n" +
            "LEFT JOIN ass_allocation ON ass_allocation.Assessment_idAssessment = assessment.idAssessment\n" +
            "WHERE\n" +
            "ass_allocation.ass_allocation_status = 1 AND\n" +
            "assessment.assessment_syn = 0";


    static int idAssessment = 0;
    static double allocation = 0;
    static double warantRate = 0;
    static double yarrate = 0;
    static double quatervalue = 0;
    static double credit = 0;

    static double count = 0;
    static double x = 0;
    static double pro = 0;

    static int currentYear;
    static int currentMonth;
    static int currentQuater;
    static int priviasQuater;
    static Date currentDate;
    static String stringDate;


    //Qstart
    static int idQstart = 0;
    static double qslqa = 0;
    static double qslqca = 0;
    static double qslqw = 0;
    static double qslqcw = 0;
    static double qsHtoPay = 0;
    static double qslya = 0;
    static double qslyca = 0;
    static double qslyw = 0;
    static double qslycw = 0;
    static double qsLqPaid = 0;

    static double qsLqPaidDiscout = 0;
    static double qsLqPaidQtot = 0;
    static double qsLqPaidFullTot = 0;

    static double newWarrant = 0;
    static double newHaveToPay = 0;
    static boolean hasCredit = false;
    static int idAss_creditDebit;

    public static void clearVariable() {
        idAssessment = 0;
        allocation = 0;
        warantRate = 0;
        yarrate = 0;
        quatervalue = 0;
        credit = 0;
        hasCredit = false;
        qsLqPaidDiscout = 0;
        qsLqPaidQtot = 0;
        qsLqPaidFullTot = 0;
        newWarrant = 0;
        newHaveToPay = 0;
        idAss_creditDebit = 0;
        //Qstart
        idQstart = 0;
        qslqa = 0;
        qslqca = 0;
        qslqw = 0;
        qslqcw = 0;
        qsHtoPay = 0;
        qsLqPaid = 0;
        qslya = 0;
        qslyca = 0;
        qslyw = 0;
        qslycw = 0;
    }


    public static void loadData() {
        Quater quater = GetInstans.getQuater();
        currentYear = quater.getCurrentYear();
        currentMonth = quater.getCurrentMonth();
        currentQuater = quater.getCurrentQuater();
        priviasQuater = quater.getPrviasQuater();
        currentDate = quater.getSystemDate();
        stringDate = new SimpleDateFormat("yyyy-MM-dd").format(currentDate);
    }


    public static void startProcess(JFXProgressBar progras) {

        loadData();

        try {

            int quaryYear = 0;
            if (priviasQuater == 4) {
                quaryYear = currentYear - 1;
            } else {
                quaryYear = currentYear;
            }


            ResultSet totcount = DB.getData(getCount);
            if (totcount.last()) {
                count = totcount.getDouble("COUNT(idAssessment)");
                System.out.println(count + "   +++++++++++++++++++++++");
            }

            ResultSet ad = DB.getData(getAll);
            while (ad.next()) {
                clearVariable();
                x = x + 1;
                pro = x / count;

                progras.setProgress(pro);

                idAssessment = ad.getInt("idAssessment");
                allocation = ad.getDouble("ass_allocation");
                warantRate = ad.getDouble("ass_nature_warrant_rate");
                yarrate = ad.getDouble("ass_nature_year_rate");

                quatervalue = allocation * yarrate / 100 / 4;

                quatervalue = modle.Maths.round2(quatervalue);


                String getCD = "SELECT\n" +
                        "ass_creditdebit.idAss_CreditDebit,\n" +
                        "ass_creditdebit.Ass_CreditDebit_discription,\n" +
                        "ass_creditdebit.Ass_CreditDebit_cd,\n" +
                        "ass_creditdebit.Ass_CreditDebit_amount,\n" +
                        "ass_creditdebit.Ass_balance,\n" +
                        "ass_creditdebit.Ass_CreditDebit_date,\n" +
                        "ass_creditdebit.Assessment_idAssessment,\n" +
                        "ass_creditdebit.Ass_CreditDebit_status\n" +
                        "FROM\n" +
                        "\t`ass_creditdebit`\n" +
                        "WHERE\n" +
                        "\tass_creditdebit.Ass_CreditDebit_status = 1\n" +
                        "AND ass_creditdebit.Assessment_idAssessment = '" + idAssessment + "'" +
                        "  AND ass_creditdebit.Ass_balance < 0";


                ResultSet cddata = DB.getData(getCD);
                if (cddata.last()) {
                    credit = cddata.getDouble("Ass_balance");
                    System.out.println("Credit ==================================================================================================");
                    idAss_creditDebit = cddata.getInt("idAss_CreditDebit");
                    credit = -1 * credit;
                    System.out.println(credit);
                    hasCredit = true;


                    System.out.println("Credit ==================================================================================================");
                }

                String getQstart = "SELECT\n"
                        + "assessment.idAssessment,\n"
                        + "ass_qstart.idass_Qstart,\n"
                        + "ass_qstart.ass_Qstart_QuaterNumber,\n"
                        + "ass_qstart.ass_Qstart_process_date,\n"
                        + "ass_qstart.ass_Qstart_LY_Arreas,\n"
                        + "ass_qstart.ass_Qstart_LY_Warrant,\n"
                        + "ass_qstart.ass_Qstart_LYC_Arreas,\n"
                        + "ass_qstart.ass_Qstart_LYC_Warrant,\n"
                        + "ass_qstart.ass_Qstart_LQ_Arreas,\n"
                        + "ass_qstart.ass_Qstart_LQC_Arreas,\n"
                        + "ass_qstart.ass_Qstart_LQ_Warrant,\n"
                        + "ass_qstart.ass_Qstart_LQC_Warrant,\n"
                        + "ass_qstart.ass_Qstart_HaveToQPay,\n"
                        + "ass_qstart.ass_Qstart_QPay,\n"
                        + "ass_qstart.ass_Qstart_QDiscont,\n"
                        + "ass_qstart.ass_Qstart_QTot,\n"
                        + "ass_qstart.ass_Qstart_FullTotal,\n"
                        + "ass_qstart.ass_Qstart_status,\n"
                        + "ass_qstart.Assessment_idAssessment,\n"
                        + "ass_qstart.ass_Qstart_year\n"
                        + "FROM\n"
                        + "ass_qstart\n"
                        + "INNER JOIN assessment ON ass_qstart.Assessment_idAssessment = assessment.idAssessment\n"
                        + "WHERE\n"
                        + "assessment.idAssessment = '" + idAssessment + "' AND\n"
                        + "ass_qstart.ass_Qstart_QuaterNumber = '" + priviasQuater + "' AND\n"
                        + "ass_qstart.ass_Qstart_status = 1 AND\n"
                        + "ass_qstart.ass_Qstart_year = '" + quaryYear + "'";


                String histry = "SELECT\n" +
                        "\tassessment.idAssessment,\n" +
                        "\tass_payhistry.idass_PayHistry,\n" +
                        "\tass_payhistry.ass_PayHistry_Qcunt,\n" +
                        "\tass_payhistry.ass_PayHistry_year,\n" +
                        "\tass_payhistry.ass_PayHistry_Date,\n" +
                        "\tass_payhistry.ass_PayHistry_status,\n" +
                        "\tass_payhistry.ass_PayHistry_comment,\n" +
                        "\tass_payhistry.ass_PayHistry_TotalPayid,\n" +
                        "\tass_payhistry.ass_PayHistry_Q1,\n" +
                        "\tass_payhistry.ass_PayHistry_Q2,\n" +
                        "\tass_payhistry.ass_PayHistry_Q3,\n" +
                        "\tass_payhistry.ass_PayHistry_Q4,\n" +
                        "\tass_payhistry.ass_PayHistry_Over,\n" +
                        "\tass_payhistry.Assessment_idAssessment,\n" +
                        "\tass_payhistry.ass_PayHistry_DRQ1,\n" +
                        "\tass_payhistry.ass_PayHistry_DRQ2,\n" +
                        "\tass_payhistry.ass_PayHistry_DRQ3,\n" +
                        "\tass_payhistry.ass_PayHistry_DRQ4,\n" +
                        "\tass_payhistry.ass_PayHistry_Q1Status,\n" +
                        "\tass_payhistry.ass_PayHistry_Q2Status,\n" +
                        "\tass_payhistry.ass_PayHistry_Q3Status,\n" +
                        "\tass_payhistry.ass_PayHistry_Q4Status\n" +
                        "FROM\n" +
                        "\tassessment\n" +
                        "INNER JOIN ass_payhistry ON ass_payhistry.Assessment_idAssessment = assessment.idAssessment\n" +
                        "WHERE\n" +
                        "\tassessment.idAssessment = '" + idAssessment + "' \n" +
                        "AND ass_payhistry.ass_PayHistry_year = '" + currentYear + "'\n" +
                        "AND ass_payhistry.ass_PayHistry_status = 1";


                ResultSet data = DB.getData(getQstart);

                if (data.last()) {
                    idQstart = data.getInt("idass_Qstart");
                    newHaveToPay = data.getDouble("ass_Qstart_HaveToQPay");
                    qslyca = data.getDouble("ass_Qstart_LYC_Arreas");
                    qslycw = data.getDouble("ass_Qstart_LYC_Warrant");

                    if (hasCredit) {
                        if (qslycw > credit) {
                            qslycw = qslycw - credit;
                            credit = 0;
                        } else {
                            credit = credit - qslycw;
                            qslycw = 0;
                        }
                        if (qslyca > credit) {
                            qslyca = qslyca - credit;
                            credit = 0;
                        } else {
                            credit = credit - qslyca;
                            qslyca = 0;
                        }
                    }


                    if (priviasQuater != 1) {
                        //Last Quater eke arriars eka witharai mekata enne; me aurudde hema quater ekakama arriars eka enne ne
                        qslqca = data.getDouble("ass_Qstart_LQC_Arreas");
                        qslqcw = data.getDouble("ass_Qstart_LQC_Warrant");
                    }


                }


                String tycaq = "SELECT\n" +
                        "\tass_qstart.idass_Qstart,\n" +
                        "\tass_qstart.ass_Qstart_QuaterNumber,\n" +
                        "\tass_qstart.ass_Qstart_process_date,\n" +
                        "\tass_qstart.ass_Qstart_LQC_Arreas,\n" +
                        "\tass_qstart.ass_Qstart_LQC_Warrant\n" +
                        "FROM\n" +
                        "\tass_qstart\n" +
                        "WHERE\n" +
                        "\tass_Qstart_year = '" + currentYear + "'\n" +
                        "AND Assessment_idAssessment = '" + idAssessment + "'";

                ResultSet tyaw = DB.getData(tycaq);


                while (tyaw.next()) {
                    int qsid = tyaw.getInt("idass_Qstart");
                    int qn = tyaw.getInt("ass_Qstart_QuaterNumber");
                    if (qn == 2) {
                        double qca = tyaw.getDouble("ass_Qstart_LQC_Arreas");
                        double qcw = tyaw.getDouble("ass_Qstart_LQC_Warrant");
                        if (hasCredit) {
                            if (credit > 0) {
                                updateQstartLQCAW(qcw, qca, qsid, qn);

                            }
                        }
                    }
                    if (qn == 3) {
                        double qca = tyaw.getDouble("ass_Qstart_LQC_Arreas");
                        double qcw = tyaw.getDouble("ass_Qstart_LQC_Warrant");
                        if (hasCredit) {
                            if (credit > 0) {
                                updateQstartLQCAW(qcw, qca, qsid, qn);
                            }
                        }
                    }
                    if (qn == 4) {
                        double qca = tyaw.getDouble("ass_Qstart_LQC_Arreas");
                        double qcw = tyaw.getDouble("ass_Qstart_LQC_Warrant");
                        if (hasCredit) {
                            if (credit > 0) {
                                updateQstartLQCAW(qcw, qca, qsid, qn);
                            }
                        }
                    }
                }





                if (hasCredit) {
                    ResultSet data1 = DB.getData(getQstart);
                    if (data1.last()) {
                        newHaveToPay = data1.getDouble("ass_Qstart_HaveToQPay");
                    }
                }


                int q1s = 0;
                int q2s = 0;
                int q3s = 0;
                int q4s = 0;

                ResultSet hd = DB.getData(histry);


                while (hd.next()) {

                    int idass_payHistry = hd.getInt("idass_PayHistry");
                    if (q1s == 0) {
                        q1s = hd.getInt("ass_payhistry.ass_PayHistry_Q1Status");
                    }

                    if (q2s == 0) {
                        q2s = hd.getInt("ass_payhistry.ass_PayHistry_Q2Status");
                    }

                    if (q3s == 0) {
                        q3s = hd.getInt("ass_payhistry.ass_PayHistry_Q3Status");
                    }

                    if (q4s == 0) {
                        q4s = hd.getInt("ass_payhistry.ass_PayHistry_Q4Status");
                    }


                    switch (currentQuater) {
                        case 1:
                            double ass_payHistry_q1 = hd.getDouble("ass_PayHistry_Q1");
                            qsLqPaid = ass_payHistry_q1;
                            if (q1s == 1) {
                                qsHtoPay = 0;
                            } else {
                                qsHtoPay = quatervalue - ass_payHistry_q1;
                            }
                            break;
                        case 2:
                            double ass_payHistry_q2 = hd.getDouble("ass_PayHistry_Q2");
                            qsLqPaid = ass_payHistry_q2;
                            if (q2s == 1) {
                                qsHtoPay = 0;
                            } else {
                                qsHtoPay = quatervalue - ass_payHistry_q2;
                            }
                            break;
                        case 3:
                            double ass_payHistry_q3 = hd.getDouble("ass_PayHistry_Q3");
                            qsLqPaid = ass_payHistry_q3;
                            if (q3s == 1) {
                                qsHtoPay = 0;
                            } else {
                                qsHtoPay = quatervalue - ass_payHistry_q3;
                            }
                            break;
                        case 4:
                            double ass_payHistry_q4 = hd.getDouble("ass_PayHistry_Q4");
                            qsLqPaid = ass_payHistry_q4;
                            if (q4s == 1) {
                                qsHtoPay = 0;
                            } else {
                                qsHtoPay = quatervalue - ass_payHistry_q4;
                            }
                            break;
                    }
                }

                if (newHaveToPay > 1.00) {
                    if (priviasQuater == 1) {
                        if (q1s == 0) {
                            newWarrant = modle.Maths.round2(quatervalue * warantRate / 100);
                        }else{
                            newHaveToPay = 0;
                        }
                    }
                    if (priviasQuater == 2) {
                        if (q2s == 0) {
                            newWarrant = modle.Maths.round2(quatervalue * warantRate / 100);
                        }else{
                            newHaveToPay = 0;
                        }
                    }
                    if (priviasQuater == 3) {
                        if (q3s == 0) {
                            newWarrant = modle.Maths.round2(quatervalue * warantRate / 100);
                        }else{
                            newHaveToPay = 0;
                        }
                    }
                    if (priviasQuater == 4) {
                        if (q4s == 0) {
                            newWarrant = modle.Maths.round2(quatervalue * warantRate / 100);
                        }else{
                            newHaveToPay = 0;
                        }
                    }

                }


                double discount10 = newHaveToPay * 10 / 100;
                double qv10 = newHaveToPay - discount10;

                double discount5 = newHaveToPay * 5 / 100;
                double qv5 = newHaveToPay - discount5;


                saveQstart(idAssessment, qslyca, qslycw, newHaveToPay, newWarrant, qsHtoPay, qsLqPaid, 0, qsLqPaidQtot, qsLqPaidFullTot);
                updateQstartOld(idQstart);


                if (q1s == 0) {
                    if (currentQuater == 1) {
                        q1s = 0;
                    }
                    if (currentQuater == 2) {
                        q1s = 1;
                    }
                    if (currentQuater == 3) {
                        q1s = 1;
                    }
                    if (currentQuater == 4) {
                        q1s = 1;
                    }
                }

                if (q2s == 0) {
                    if (currentQuater == 1) {
                        q2s = 0;
                    }
                    if (currentQuater == 2) {
                        q2s = 0;
                    }
                    if (currentQuater == 3) {
                        q2s = 1;
                    }
                    if (currentQuater == 4) {
                        q2s = 1;
                    }
                }

                if (q3s == 0) {
                    if (currentQuater == 1) {
                        q3s = 0;
                    }
                    if (currentQuater == 2) {
                        q3s = 0;
                    }
                    if (currentQuater == 3) {
                        q3s = 0;
                    }
                    if (currentQuater == 4) {
                        q2s = 1;
                    }
                }

                if (q4s == 0) {
                    if (currentQuater == 1) {
                        q4s = 0;
                    }
                    if (currentQuater == 2) {
                        q4s = 0;
                    }
                    if (currentQuater == 3) {
                        q4s = 0;
                    }
                    if (currentQuater == 4) {
                        q4s = 0;
                    }
                }


                if (hasCredit) {
                    if (credit > 0) {

                        if (q1s == 0 && q2s == 0 && q3s == 0 && q4s == 0) {
                            if (credit >= qv10 * 4) {
                                saveNewPayHistory(idAssessment, currentQuater, currentYear, stringDate, qv10 * 4, qv10, qv10, qv10, qv10, credit, 10, 10, 10, 10, 1, 1, 1, 1);
                            } else if (credit >= qv5 * 3) {
                                credit = credit - qv5 * 3;
                                saveNewPayHistory(idAssessment, currentQuater, currentYear, stringDate, qv5 * 3 + credit, qv5, qv5, qv5, credit, 0, 5, 5, 5, 0, 1, 1, 1, 0);
                            } else if (credit >= qv5 * 2) {
                                credit = credit - qv5 * 2;
                                saveNewPayHistory(idAssessment, currentQuater, currentYear, stringDate, qv5 * 2 + credit, qv5, qv5, credit, 0, 0, 5, 5, 0, 0, 1, 1, 0, 0);
                            } else if (credit >= qv5) {
                                credit = credit - qv5;
                                saveNewPayHistory(idAssessment, currentQuater, currentYear, stringDate, qv5 + credit, qv5, credit, 0, 0, 0, 5, 0, 0, 0, 1, 0, 0, 0);
                            } else {
                                saveNewPayHistory(idAssessment, currentQuater, currentYear, stringDate, credit, credit, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
                            }
                        } else if (q1s == 1 && q2s == 0 && q3s == 0 && q4s == 0) {
                            if (credit >= qv5 * 3) {
                                credit = credit - qv5 * 3;
                                saveNewPayHistory(idAssessment, currentQuater, currentYear, stringDate, qv5 * 3 + credit, 0, qv5, qv5, qv5, credit, 0, 5, 5, 5, 1, 1, 1, 1);
                            } else if (credit >= qv5 * 2) {
                                credit = credit - qv5 * 2;
                                saveNewPayHistory(idAssessment, currentQuater, currentYear, stringDate, qv5 * 2 + credit, 0, qv5, qv5, credit, 0, 0, 5, 5, 0, 1, 1, 1, 0);
                            } else if (credit >= qv5) {
                                credit = credit - qv5;
                                saveNewPayHistory(idAssessment, currentQuater, currentYear, stringDate, qv5 + credit, 0, qv5, credit, 0, 0, 0, 5, 0, 0, 1, 1, 0, 0);
                            } else {
                                saveNewPayHistory(idAssessment, currentQuater, currentYear, stringDate, credit, 0, credit, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0);
                            }

                        } else if (q1s == 1 && q2s == 1 && q3s == 0 && q4s == 0) {

                            if (credit >= qv5 * 2) {
                                credit = credit - qv5 * 2;
                                saveNewPayHistory(idAssessment, currentQuater, currentYear, stringDate, qv5 * 2 + credit, 0, 0, qv5, qv5, credit, 0, 0, 5, 5, 1, 1, 1, 1);
                            } else if (credit >= qv5) {
                                credit = credit - qv5;
                                saveNewPayHistory(idAssessment, currentQuater, currentYear, stringDate, qv5 + credit, 0, 0, qv5, credit, 0, 0, 0, 5, 0, 1, 1, 1, 0);
                            } else {
                                saveNewPayHistory(idAssessment, currentQuater, currentYear, stringDate, credit, 0, 0, credit, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0);
                            }


                        } else if (q1s == 1 && q2s == 1 && q3s == 1 && q4s == 0) {
                            if (credit >= qv5) {
                                credit = credit - qv5;
                                saveNewPayHistory(idAssessment, currentQuater, currentYear, stringDate, qv5 + credit, 0, 0, 0, qv5, credit, 0, 0, 0, 5, 1, 1, 1, 1);
                            } else {
                                saveNewPayHistory(idAssessment, currentQuater, currentYear, stringDate, credit, 0, 0, 0, credit, 0, 0, 0, 0, 0, 1, 1, 1, 0);
                            }

                        } else if (q1s == 1 && q2s == 1 && q3s == 1 && q4s == 1) {
                            saveNewPayHistory(idAssessment, currentQuater, currentYear, stringDate, credit, 0, 0, 0, 0, credit, 0, 0, 0, 0, 1, 1, 1, 1);
                        }

                    } else {
                        saveNewPayHistory(idAssessment, currentQuater, currentYear, stringDate, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, q1s, q2s, q3s, q4s);
                    }

                    updateCredit(idAss_creditDebit);

                } else {
                    saveNewPayHistory(idAssessment, currentQuater, currentYear, stringDate, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, q1s, q2s, q3s, q4s);
                }

                System.out.println(x);
                System.out.println(pro);

            }

            System.out.println(x);
            System.out.println(pro);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static void saveQstart(int idAssessment, double lya, double lyw, double lqa, double lqw, double hvpay,
                                  double pay, double discount, double qtot, double fulltot) {

        String Q = "INSERT INTO `ass_qstart` (\n" +
                "\t`ass_Qstart_QuaterNumber`,\n" +
                "\t`ass_Qstart_process_date`,\n" +
                "\t`ass_Qstart_LY_Arreas`,\n" +
                "\t`ass_Qstart_LY_Warrant`,\n" +
                "\t`ass_Qstart_LYC_Arreas`,\n" +
                "\t`ass_Qstart_LYC_Warrant`,\n" +
                "\t`ass_Qstart_LQ_Arreas`,\n" +
                "\t`ass_Qstart_LQC_Arreas`,\n" +
                "\t`ass_Qstart_LQ_Warrant`,\n" +
                "\t`ass_Qstart_LQC_Warrant`,\n" +
                "\t`ass_Qstart_HaveToQPay`,\n" +
                "\t`ass_Qstart_QPay`,\n" +
                "\t`ass_Qstart_QDiscont`,\n" +
                "\t`ass_Qstart_QTot`,\n" +
                "\t`ass_Qstart_FullTotal`,\n" +
                "\t`ass_Qstart_status`,\n" +
                "\t`Assessment_idAssessment`,\n" +
                "\t`ass_Qstart_year`\n" +
                ")\n" +
                "VALUES\n" +
                "\t(\n" +
                "\t\t'" + currentQuater + "',\n" +
                "\t\t'" + stringDate + "',\n" +
                "\t\t'" + lya + "',\n" +
                "\t\t'" + lyw + "',\n" +
                "\t\t'" + lya + "',\n" +
                "\t\t'" + lyw + "',\n" +
                "\t\t'" + lqa + "',\n" +
                "\t\t'" + lqa + "',\n" +
                "\t\t'" + lqw + "',\n" +
                "\t\t'" + lqw + "',\n" +
                "\t\t'" + hvpay + "',\n" +
                "\t\t'" + pay + "',\n" +
                "\t\t'" + discount + "',\n" +
                "\t\t'" + qtot + "',\n" +
                "\t\t'" + fulltot + "',\n" +
                "\t\t'1',\n" +
                "\t\t'" + idAssessment + "',\n" +
                "\t\t'" + currentYear + "'\n" +
                "\t);";
        try {
            conn.DB.setData(Q);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateQstartOld(int qstart) {
        String qq = "UPDATE `ass_qstart`\n" +
                "SET  `ass_Qstart_status` = '0'\n" +
                "WHERE\n" +
                "\t(`idass_Qstart` = '" + qstart + "')";
        try {
            conn.DB.setData(qq);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateQstartLQCAW(double qcw, double qca, int qsid, int qno) {
        if (qcw > credit) {
            qcw = qcw - credit;
            credit = 0;
        } else {
            credit = credit - qcw;
            qcw = 0;
        }

        if (qca > credit) {
            qca = qca - credit;
            credit = 0;
        } else {
            credit = credit - qca;
            qca = 0;
        }


        try {
            String comment ="Credit"+qno;
            conn.DB.setData("UPDATE `ass_qstart`\n" +
                    "SET `ass_Qstart_LQC_Arreas` = '" + qca + "',\n" +
                    " `ass_Qstart_LQC_Warrant` = '" + qcw + "',\n" +
                    " `process_update_warant` = '" + qcw + "',\n" +
                    " `process_update_arrears` = '" + qca + "',\n" +
                    "`process_update_comment` = '"+comment+"'\n" +
                    "WHERE\n" +
                    "\t(`idass_Qstart` = '" + qsid + "')");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void saveNewPayHistory(int idAssessment, int qn, int curentYear, String day, double tot,
                                         double q1p, double q2p, double q3p, double q4p, double over,
                                         double q1dr, double q2dr, double q3dr, double q4dr,
                                         int q1s, int q2s, int q3s, int q4s) {
        String qq = "INSERT INTO `ass_payhistry` (\n" +
                "\t`ass_PayHistry_Qcunt`,\n" +
                "\t`ass_PayHistry_year`,\n" +
                "\t`ass_PayHistry_Date`,\n" +
                "\t`ass_PayHistry_status`,\n" +
                "\t`ass_PayHistry_comment`,\n" +
                "\t`ass_PayHistry_TotalPayid`,\n" +
                "\t`ass_PayHistry_Q1`,\n" +
                "\t`ass_PayHistry_Q2`,\n" +
                "\t`ass_PayHistry_Q3`,\n" +
                "\t`ass_PayHistry_Q4`,\n" +
                "\t`ass_PayHistry_Over`,\n" +
                "\t`Assessment_idAssessment`,\n" +
                "\t`ass_PayHistry_DRQ1`,\n" +
                "\t`ass_PayHistry_DRQ2`,\n" +
                "\t`ass_PayHistry_DRQ3`,\n" +
                "\t`ass_PayHistry_DRQ4`,\n" +
                "\t`ass_PayHistry_Q1Status`,\n" +
                "\t`ass_PayHistry_Q2Status`,\n" +
                "\t`ass_PayHistry_Q3Status`,\n" +
                "\t`ass_PayHistry_Q4Status`\n" +
                ")\n" +
                "VALUES\n" +
                "\t(\n" +
                "\t\t'" + qn + "',\n" +
                "\t\t'" + curentYear + "',\n" +
                "\t\t'" + day + "',\n" +
                "\t\t'1',\n" +
                "\t\t'22',\n" +
                "\t\t'" + tot + "',\n" +
                "\t\t'" + q1p + "',\n" +
                "\t\t'" + q2p + "',\n" +
                "\t\t'" + q3p + "',\n" +
                "\t\t'" + q4p + "',\n" +
                "\t\t'" + over + "',\n" +
                "\t\t'" + idAssessment + "',\n" +
                "\t\t'" + q1dr + "',\n" +
                "\t\t'" + q2dr + "',\n" +
                "\t\t'" + q3dr + "',\n" +
                "\t\t'" + q4dr + "',\n" +
                "\t\t'" + q1s + "',\n" +
                "\t\t'" + q2s + "',\n" +
                "\t\t'" + q3s + "',\n" +
                "\t\t'" + q4s + "'\n" +
                "\t)\n" +
                "\n";

        try {
            conn.DB.setData(qq);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateCredit(int idcd) {
        String quary = "UPDATE `ultimate2`.`ass_creditdebit`\n" +
                "SET `Ass_balance` = '0',\n" +
                " `Ass_CreditDebit_status` = '0'\n" +
                "WHERE\n" +
                "\t(\n" +
                "\t\t`idAss_CreditDebit` = '" + idcd + "'\n" +
                "\t)";
        try {
            conn.DB.setData(quary);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
// '"+  +"'      "+ +"