import java.util.regex.Pattern;

public class User {
 
    private String fName, iName, oName;
    private String birthday;
    private String tel;
    private char gender;

    public User(String fName, String iName, String oName, String birthday, String tel, char gender) {

        this.fName = fName;
        this.iName = iName;
        this.birthday = birthday;
        this.tel = tel;
        this.gender = gender;

    }

    public User(String str) {

        var strParam = parseStr(str);
        
        Pattern patternFio = Pattern.compile("^[A-Z][a-z]*$");
        Pattern patternBirthday = Pattern.compile("^\\d\\d.\\d\\d.\\d\\d\\d\\d$");
        Pattern patternTel = Pattern.compile("^[+][\\d]+$");

        
        if (strParam.length != 6) throw new MyOwnException("Неверное количество параметров!");

        this.fName = get_fName(strParam, patternFio);
        this.iName = get_iName(strParam, patternFio);
        this.oName = get_oName(strParam, patternFio);
        this.birthday = get_birthday(strParam, patternBirthday);
        this.tel = get_tel(strParam, patternTel);
        this.gender = get_gender(strParam); 

    }

    private String[] parseStr(String str) {
        return str.split(" ");
    }

    private String get_fName(String[] arrStr, Pattern pattern) {

        fName = arrStr[0];
        var matcher = pattern.matcher(fName);
        if (matcher.find()) return fName;
        else
            throw new MyOwnException("В фамилии недопустимые символы!");
        
    }

    private String get_iName(String[] arrStr, Pattern pattern) {

        iName = arrStr[1];
        var matcher = pattern.matcher(iName);
        if (matcher.find()) return iName;
        else
            throw new MyOwnException("В имени недопустимые символы!");
        
    }

    private String get_oName(String[] arrStr, Pattern pattern) {

        oName = arrStr[2];
        var matcher = pattern.matcher(oName);
        if (matcher.find()) return oName;
        else
            throw new MyOwnException("В отчестве недопустимые символы!");
    }

    private String get_birthday(String[] arrStr, Pattern pattern) {

        birthday = arrStr[3];
        var matcher = pattern.matcher(birthday);
        if (matcher.find()) return birthday;
        else
            throw new MyOwnException("День рождения введён некоректно! ");
    }

    private String get_tel(String[] arrStr, Pattern pattern) {

        tel = arrStr[4];
        var matcher = pattern.matcher(tel);
        if (matcher.find()) return tel;
        else
            throw new MyOwnException("Телефон введён некоректно! ");
    }

    private char get_gender(String[] arrStr) {

        char[] genderArr = arrStr[5].toCharArray();

        if (genderArr.length != 1 || !(genderArr[0] == 'f' || genderArr[0] == 'm'))
        throw new MyOwnException("Пол введён некоректно");
        return genderArr[0];
    }

    public String serialyzeUser() {
        return String.format("<%s><%s><%s><%s><%s><%c>", this.fName, this.iName, 
                                    this.oName, this.birthday, this.tel, this.gender);   }

    public String getName() {
        return fName;
    }
}
