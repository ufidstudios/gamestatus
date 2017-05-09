   package com.ufidstudios.igt.gamestatus.model.valueobjects;

    import java.io.Serializable;
    import com.google.gson.annotations.Expose;
    import com.google.gson.annotations.SerializedName;
    import org.apache.commons.lang.builder.EqualsBuilder;
    import org.apache.commons.lang.builder.HashCodeBuilder;
    import org.apache.commons.lang.builder.ToStringBuilder;

public class GameData implements Serializable
{

    @SerializedName("mName")
    @Expose
    private String mName;

    @SerializedName("mJackpot")
    @Expose
    private Double mJackpot;

    @SerializedName("mDate")
    @Expose
    private String mDate;

    public String getId() {
        return mId;
    }

    public void setId(String mId) {
        this.mId = mId;
    }

    @SerializedName("mId")
    @Expose
    private String mId;

    private final static long serialVersionUID = 976399103785456166L;

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public Double getJackpot() {
        return mJackpot;
    }

    public void setJackpot(Double jackpot) {
        this.mJackpot = jackpot;
    }

    public String getDate() {
        return mDate;
    }

    public void setDate(String date) {
        this.mDate = date;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mName).append(mJackpot).append(mDate).toHashCode();
    }


    public GameData() {
        this.mName = "Loading...";
        this.mDate = "Loading...";
        this.mId = getDate().toString();
        this.mJackpot = 0.0;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GameData) == false) {
            return false;
        }
        GameData rhs = ((GameData) other);
        return new EqualsBuilder().append(mName, rhs.mName).append(mJackpot, rhs.mJackpot).append(mDate, rhs.mDate).isEquals();
    }

}
