import java.util.ArrayList;
import java.util.List;

public class Heros {

    private String mName;
    private String mAge;
    private String mPower;
    private String mWeakness;
    private static List<Heros> instances = new ArrayList<Heros>();
    private int mId ;

    public Heros (String name, String age, String power, String weakness){
        mName = name;
        mAge =  age;
        mPower = power;
        mWeakness = weakness;
        instances.add(this);
        mId = instances.size();

    }

    public String getmName() {
        return mName;
    }


    public String getmAge() {
        return mAge;
    }

    public String getmPower() {
        return mPower;
    }

    public String getmWeakness() {
        return mWeakness;
    }

    public static List<Heros> all() {
        return instances;
    }

    public int getmId() {
        return mId;
    }
}
