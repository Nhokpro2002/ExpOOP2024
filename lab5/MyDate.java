package hus.oop.lab5;

public class MyDate {

    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final int[] DAYSINMONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 || year % 400 == 0;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if((year > 0 && year < 10000) && (month > 0 && month < 13)) {
            switch (month) {
                case 1:
                    if (day > 0 && day < 32) return true;
                    break;
                case 2:
                    if ((isLeapYear(year) && day > 0 && day < 30) || (!isLeapYear(year) && day > 0 && day < 29))
                        return true;
                    break;
                case 3:
                    if (day > 0 && day < 32) return true;
                    break;
                case 4:
                    if (day > 0 && day < 31) return true;
                    break;
                case 5:
                    if (day > 0 && day < 32) return true;
                    break;
                case 6:
                    if (day > 0 && day < 31) return true;
                    break;
                case 7:
                    if (day > 0 && day < 32) return true;
                    break;
                case 8:
                    if (day > 0 && day < 32) return true;
                    break;
                case 9:
                    if (day > 0 && day < 31) return true;
                    break;
                case 10:
                    if (day > 0 && day < 32) return true;
                    break;
                case 11:
                    if (day > 0 && day < 31) return true;
                    break;
                case 12:
                    if (day > 0 && day < 32) return true;
                    break;
            }
        }
        return false;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        //Gauss's algorithm for determining the day of the week
        if((day += month) < 3) {
            year--;
        } else {
            year = year - 2;
        }
        return (23 * month / 9 + day + 4 + year/4 - year/100 + year/400) % 7;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }



    @Override
    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[getMonth()] + " " + year;
    }

    public int dayMax() {
        int dayMax = 31;
        switch (this.getMonth()) {
            case 1:
                dayMax = 31;
                break;
            case 2:
                if (isLeapYear(this.year)) dayMax = 29;
                else dayMax = 28;
                break;
            case 3:
                dayMax = 31;
                break;
            case 4:
                dayMax = 30;
                break;
            case 5:
                dayMax = 31;
                break;
            case 6:
                dayMax = 30;
                break;
            case 7:
                dayMax = 31;
                break;
            case 8:
                dayMax = 31;
                break;
            case 9:
                dayMax = 30;
                break;
            case 10:
                dayMax = 31;
                break;
            case 11:
                dayMax = 30;
                break;
            case 12:
                dayMax = 31;
                break;
        }
        return dayMax;
    }

    public MyDate nextDay() {
            if (this.getDay() != this.dayMax()) {
                ++this.day;
            } else {
                this.day = 1;
                if (this.month == 12) {
                    this.month = 1;
                    ++this.year;
                } else {
                    ++this.month;
                }
            }
            return this;
    }

    public MyDate nextMonth() {
        int tempMonth = this.getMonth() + 1;
        if(this.getMonth() == 12) {
            tempMonth = 1;
        }
        MyDate temp = new MyDate(this.getYear(),tempMonth,1);
        if(this.dayMax() > temp.dayMax()) {
            this.setDay(this.dayMax());
        }
        if(this.month == 12) {
            this.setMonth(1);
            ++ this.year;
        } else ++ this.month;
        return this;
    }

    public MyDate nextYear() {
        try {
            if(this.year<10000) {
                ++ this.year;
                return this;
            }
            if(isLeapYear(this.getYear())) {
                if((this.getMonth() == 2) && (this.getDay() == 29)) {
                    this.setDay(28);
                }
            }
        } catch(IllegalStateException e) {
            System.out.println("Year out of range!");
        }
        return this;
    }

    public MyDate previousDay() {
        if (this.day != 1) {
            --this.day;
        } else {
            if (this.getMonth() != 1) {
                this.day = this.dayMax();
                --this.month;
            } else {
                this.day = 31;
                this.month = 12;
                --this.year;
            }
        }
        return this;
    }

    public MyDate previousMonth() {
        int tempMonth = this.getMonth() - 1;
        if(this.getMonth() == 1) {
            tempMonth = 12;
        }
        MyDate temp = new MyDate(this.getYear(),tempMonth,1);
        if(this.dayMax() > temp.dayMax()) {
            this.setDay(this.dayMax());
        }
        if(this.getMonth() != 1) {
            -- this.month;
        } else this.month = 12;
        return this;
    }

    public MyDate previousYear() {
        try {
            if(this.year > 0) {
                -- this.year;
            }
            if(isLeapYear(this.getYear())) {
                if((this.getMonth() == 2) && (this.getDay() == 29)) {
                    this.setDay(28);
                }
            }
        } catch(IllegalStateException e) {
            System.out.println("Year out of range!");
        }
        return this;
    }

}
