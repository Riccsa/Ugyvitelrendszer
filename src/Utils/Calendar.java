
package Utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import javax.swing.JLabel;

public class Calendar {

    private LocalDate date;
    private HashMap<Integer, DayOfWeek> dayOfMonth;
    private List<JLabel> days;
    private JLabel lbEv;
    private JLabel lbHo;

    public Calendar(List<JLabel> days, JLabel lbEv, JLabel lbHo) {
        this.date = LocalDate.now();
        dayOfMonth = new HashMap<>();
        this.days = days;
        this.lbEv = lbEv;
        this.lbHo = lbHo;
        updateYearMonth();
        setDaysOfMonth();
        update();

    }

    public String getMonth() {
        String name = "";
        switch (date.getMonth().name()) {

            case ("JANUARY"):
                name = "Jan";
                break;
            case ("FEBRUARY"):
                name = "Feb";
                break;
            case ("MARCH"):
                name = "Már";
                break;
            case ("APRIL"):
                name = "Ápr";
                break;
            case ("MAY"):
                name = "Máj";
                break;
            case ("JUNE"):
                name = "Jún";
                break;
            case ("JULY"):
                name = "Júl";
                break;
            case ("AUGUST"):
                name = "Aug";
                break;
            case ("SEPTEMBER"):
                name = "Szept";
                break;
            case ("OCTOBER"):
                name = "Okt";
                break;
            case ("NOVEMBER"):
                name = "Nov";
                break;
            case ("DECEMBER"):
                name = "Dec";
                break;

        }

        return name;

    }

    private void setDaysOfMonth() {

        dayOfMonth.clear();

        LocalDate thisMonth = date;
        int monthLength = thisMonth.lengthOfMonth();
        thisMonth = thisMonth.withDayOfMonth(1);

        for (int i = 0; i < monthLength; i++) {
            dayOfMonth.put(thisMonth.getDayOfMonth(), thisMonth.getDayOfWeek());
            thisMonth = thisMonth.plusDays(1);
            
        }

    }

    public void nextMonth() {
        date = date.plusMonths(1);
        setDaysOfMonth();
        update();
    }

    public void previousMonth() {
        date = date.minusMonths(1);
        setDaysOfMonth();
        update();

    }

    public void nextYear() {
        date = date.plusYears(1);
        setDaysOfMonth();
        update();
    }

    public void previousYear() {
        date = date.minusYears(1);
        setDaysOfMonth();
        update();
    }

    public int getYear() {
        return date.getYear();
    }
    
    public int getMonthValue(){
        return date.getMonthValue();
    }

    public HashMap<Integer, DayOfWeek> getDayOfMonth() {
        return dayOfMonth;
    }

    private void update() {
        updateYearMonth();
        clearCalendar();

        int listCounter = listCounter = dayOfMonth.get(1).getValue() - 1;

        for (Integer key : dayOfMonth.keySet()) {
            days.get(listCounter).setText(Integer.toString(key));
            listCounter++;

        }


    }

    private void clearCalendar() {

        for (JLabel label : days) {

            label.setText("");

        }
    }

    private void updateYearMonth() {

        lbEv.setText(Integer.toString(getYear()));
        lbHo.setText(getMonth());

    }

}
