package com.company.lesson15;

import java.text.MessageFormat;

public class task7 {
    public static void main(String[] args) {
        String[][] holidays = {{"01.01", "Новый год"}, {"07.01", "Рождество"},
                {"08.03", "Женский день"}, {"01.05", "День труда"}, {"09.05", "День Победы"},
                {"28.06", "День Конституции"}, {"24.08", "День независимости"}, {"14.10", "День защитника"}};


        showHolidays(holidays);
    }

    public static void showHolidays(String[][] array){
        String mainStr = "{0} празднуется {1}";
        for (int i = 0; i < array.length - 1; i++){
                System.out.println(MessageFormat.format(mainStr,array[i][0],array[i][1]));
            }
        }
    }

