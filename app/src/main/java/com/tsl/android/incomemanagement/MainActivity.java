package com.tsl.android.incomemanagement;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText etSalary;
    int salary = 0;
    double daily, social, study, leisure, invest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonEnter(View v) {
        etSalary = (EditText) findViewById(R.id.etSalary);
        String salaryInput = etSalary.getText().toString();

        if (salaryInput.isEmpty()) {
            Context context = getApplicationContext();
            CharSequence text = "Please input your salary";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else {
            salary = Integer.parseInt(etSalary.getText().toString());
            daily = (salary * 0.3);
            social = (salary * 0.2);
            study = (salary * 0.15);
            leisure = (salary * 0.1);
            invest = (salary * 0.25);

            TextView tvSalary = (TextView) findViewById(R.id.tvSalary);
            String string = "Rp. " + salary + ",-";
            tvSalary.setText(string);
            onClickYear(v);
        }

    }

    public void onClickDay(View v) {
        TextView dayWeekMonth = (TextView) findViewById(R.id.dayWeekMonth);
        String dwm = getString(R.string.one_day);
        dayWeekMonth.setText(dwm);
        displayDailyNeedsDay(v);
        displaySocialLifeDay(v);
        displayStudyDay(v);
        displayLeisureDay(v);
        displayInvestDay(v);
    }


    /**
     * FOR 1 DAY
     */
    public void displayDailyNeedsDay(View v) {
        TextView tvDaily = (TextView) findViewById(R.id.tvDaily);
        double dailyDay = daily / 30;
//        String expenseDaily = "Rp. " + daily + ",-";
        tvDaily.setText(String.format("Rp. %.2f,-", dailyDay));
    }

    public void displaySocialLifeDay(View v) {
        TextView tvSocial = (TextView) findViewById(R.id.tvSocial);
        double socialDay = social / 30;
        tvSocial.setText(String.format("Rp. %.2f,-", socialDay));
    }

    public void displayStudyDay(View v) {
        TextView tvStudy = (TextView) findViewById(R.id.tvStudy);
        double studyDay = study / 30;
        tvStudy.setText(String.format("Rp. %.2f,-", studyDay));
    }

    public void displayLeisureDay(View v) {
        TextView tvLeisure = (TextView) findViewById(R.id.tvLeisure);
        double leisureDay = leisure / 30;
        tvLeisure.setText(String.format("Rp. %.2f,-", leisureDay));
    }

    public void displayInvestDay(View v) {
        TextView tvInvest = (TextView) findViewById(R.id.tvInvest);
        double investDay = invest / 30;
        tvInvest.setText(String.format("Rp. %.2f,-", investDay));
    }


    /**
     * FOR 1 WEEK
     */
    public void onClickWeek(View v) {
        TextView dayWeekMonth = (TextView) findViewById(R.id.dayWeekMonth);
        String dwm = getString(R.string.one_week);
        dayWeekMonth.setText(dwm);
        displayDailyNeedsWeek(v);
        displaySocialLifeWeek(v);
        displayStudyWeek(v);
        displayLeisureWeek(v);
        displayInvestWeek(v);
    }

    public void displayDailyNeedsWeek(View v) {
        TextView tvDaily = (TextView) findViewById(R.id.tvDaily);
        double dailyWeek = daily / 4;
//        String expenseDaily = "Rp. " + daily + ",-";
        tvDaily.setText(String.format("Rp. %.2f,-", dailyWeek));
    }

    public void displaySocialLifeWeek(View v) {
        TextView tvSocial = (TextView) findViewById(R.id.tvSocial);
        double socialWeek = social / 4;
        tvSocial.setText(String.format("Rp. %.2f,-", socialWeek));
    }

    public void displayStudyWeek(View v) {
        TextView tvStudy = (TextView) findViewById(R.id.tvStudy);
        double studyWeek = study / 4;
        tvStudy.setText(String.format("Rp. %.2f,-", studyWeek));
    }

    public void displayLeisureWeek(View v) {
        TextView tvLeisure = (TextView) findViewById(R.id.tvLeisure);
        double leisureWeek = leisure / 4;
        tvLeisure.setText(String.format("Rp. %.2f,-", leisureWeek));
    }

    public void displayInvestWeek(View v) {
        TextView tvInvest = (TextView) findViewById(R.id.tvInvest);
        double investWeek = invest / 4;
        tvInvest.setText(String.format("Rp. %.2f,-", investWeek));
    }


    /**
     * FOR 1 MONTH
     */

    public void onClickYear(View v) {
        TextView dayWeekMonth = (TextView) findViewById(R.id.dayWeekMonth);
        String dwm = getString(R.string.one_month);
        dayWeekMonth.setText(dwm);
        displayDailyNeedsYear(v);
        displaySocialLifeYear(v);
        displayStudyYear(v);
        displayLeisureYear(v);
        displayInvestYear(v);
    }

    public void displayDailyNeedsYear(View v) {
        TextView tvDaily = (TextView) findViewById(R.id.tvDaily);
        tvDaily.setText(String.format("Rp. %.2f,-", daily));
    }

    public void displaySocialLifeYear(View v) {
        TextView tvSocial = (TextView) findViewById(R.id.tvSocial);
        tvSocial.setText(String.format("Rp. %.2f,-", social));
    }

    public void displayStudyYear(View v) {
        TextView tvStudy = (TextView) findViewById(R.id.tvStudy);
        tvStudy.setText(String.format("Rp. %.2f,-", study));
    }

    public void displayLeisureYear(View v) {
        TextView tvLeisure = (TextView) findViewById(R.id.tvLeisure);
        tvLeisure.setText(String.format("Rp. %.2f,-", leisure));
    }

    public void displayInvestYear(View v) {
        TextView tvInvest = (TextView) findViewById(R.id.tvInvest);
        tvInvest.setText(String.format("Rp. %.2f,-", invest));
    }


    /**
     * ABOUT & HELP
     */
    public void onHelp(View v) {
        Intent intentHelpDialog = new Intent(this, HelpDialog.class);
        startActivity(intentHelpDialog);
    }

    public void onAbout(View v) {
        Intent intentAboutDialog = new Intent(this, AboutDialog.class);
        startActivity(intentAboutDialog);
    }


}
