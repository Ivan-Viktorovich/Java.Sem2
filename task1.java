// 1) Дана строка sql-запроса "select * from students WHERE ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Пример данной строки {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow


public class task1 {
    public static void main(String[] args) {
        String stroka = "name:Ivanov ,country:Russia ,city:Moscow ,age:null";
        String stroka2 = "select * from students WHERE ";
        System.out.print(stroka2);
        String[] phrase = stroka.split(",");
            for (String i : phrase) {
                if (i.contains("null")) {
                    i = i.replace(i,"");
                }
        StringBuilder s = new StringBuilder();
            if (i != "") {
                s.append("AND ").append(i);
            }
            System.out.print(s);
            
        
    }
}
}
// Прошу прощения, но я вообще не понял как это сделать, весь день убил на вот это((