package Test;

import conn.DB;

import java.sql.ResultSet;

public class QueryString {
    static String ss = "SELECT\n" +
            "account_ps_three.report_ricipt_no,\n" +
            "account_ps_three.report_vort_id,\n" +
            "account_ps_three.report_ricipt_id,\n" +
            "receipt.receipt_total,\n" +
            "book.book_diposit,\n" +
            "book_place.book_place_name,\n" +
            "account_ps_three.report_account_id,\n" +
            "account_receipt_title.ART_vote_and_bal,\n" +
            "account_ps_three.report_amount,\n" +
            "book.book_date\n" +
            "FROM\n" +
            "account_ps_three\n" +
            "INNER JOIN receipt ON receipt.idReceipt = account_ps_three.report_ricipt_id\n" +
            "INNER JOIN book ON book.idbook = receipt.recept_applicationId\n" +
            "INNER JOIN book_place ON book.book_place_idbook_place = book_place.idbook_place\n" +
            "INNER JOIN account_receipt_title ON account_receipt_title.idAccount_receipt_title = account_ps_three.report_vort_id\n" +
            "WHERE\n" +
            "account_ps_three.report_application_cat_id = 10\n" +
            "AND account_ps_three.report_vort_id = '22'";



}
