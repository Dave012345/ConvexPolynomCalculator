package sample.service;



public class InputService {


    /**
     *It can to check the Input field type, and throw a popup window to the user, if the type is not an integer type*/
    public int getValue(String txt){
        int value = 0;
        try{
            value = Integer.valueOf(txt);
        }catch (Exception e){
            ExcaptionToAlertBox alertBox = new ExcaptionToAlertBox(e.getMessage());
        }
        return value;
    }

}
