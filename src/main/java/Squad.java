


public class Squad {

    private  String mName;
    private String mCauseForFighting;
    private String mSize;

    public Squad(String name ,String causeForFighting, String size) {
        this.mName = name;
        this.mCauseForFighting = causeForFighting;
        this.mSize = size;

    }


    public String getName() {
        return mName;
    }

    public String getCauseForFighting() {
        return mCauseForFighting;
    }

    public String getSize() {
        return mSize;
    }
}
