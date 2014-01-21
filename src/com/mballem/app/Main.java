package com.mballem.app;

import com.mballem.app.dao.DBConnection;
import com.mballem.app.form.LivroForm;

/**
 * Created by IntelliJ IDEA.
 * User: Marcio Ballem
 * Date: 31/03/13
 * Time: 02:53
 * http://www.mballem.com/
 */
public class Main {
    public static void main(String[] args) {
        DBConnection.createTable();
        new LivroForm();
    }
}
