package midterm.giorgi_kitiashvili_2.task1;

import java.util.List;
import java.util.ArrayList;

public class Fantasy extends AbstractFantasy implements Dream {
    private String studentName = "0Giorgi1";

    @Override
    public String getLiterature1() {
        return "Default Literature1";
    }

    @Override
    public String getLeash2() {
        return "Default Leash2";
    }

    @Override
    public String methodTea3(String argDuty5) {
        return "Default methodTea3";
    }

    @Override
    public List<String> methodComputing4(String argElasticity6) {
        List<String> result = new ArrayList<>();
        result.add("Default methodComputing4");
        return result;
    }

    @Override
    public String toString() {
        return "Student Name: " + studentName;
    }
}