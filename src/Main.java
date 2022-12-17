public class Main {
    public static void main(String[] args) {
        //требуемый визуал 7ххххххххх (11симв)
        String phone = "+7 (908)-715-25-20";
        phone = phone.replace("-", "");
        phone = phone.replace(" ", "");
        phone = phone.replace("+", "");
        phone = phone.replace("(", "");
        phone = phone.replace(")", "");
        if (phone.length() == 10 && phone.charAt(0) != '7') {
            phone = "7" + phone;
        } else if (phone.length() > 11) {
            throw new RuntimeException("Телефон слишком длинный");
        } else if (phone.length() < 10) {
            throw new RuntimeException("Телефон слишком короткий");
        } else if (phone.length() == 11 && phone.charAt(0) == '8') {
            phone = phone.replaceFirst("8", "7");
        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
            throw new RuntimeException("Среди нас посторонний");
        } else if (phone.length() == 10 && phone.charAt(0) == '7') {
            throw new RuntimeException("Номер телефона введен некорректно");
        }
        System.out.println("phone = " + phone);

    }
}