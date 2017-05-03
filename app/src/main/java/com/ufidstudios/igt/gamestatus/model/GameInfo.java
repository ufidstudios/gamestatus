   package com.ufidstudios.igt.gamestatus.model;

    import java.io.Serializable;
    import com.google.gson.annotations.Expose;
    import com.google.gson.annotations.SerializedName;
    import org.apache.commons.lang.builder.EqualsBuilder;
    import org.apache.commons.lang.builder.HashCodeBuilder;
    import org.apache.commons.lang.builder.ToStringBuilder;

public class GameInfo implements Serializable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("jackpot")
    @Expose
    private Integer jackpot;
    @SerializedName("date")
    @Expose
    private String date;
    private final static long serialVersionUID = 976399103785456166L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getJackpot() {
        return jackpot;
    }

    public void setJackpot(Integer jackpot) {
        this.jackpot = jackpot;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(jackpot).append(date).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GameInfo) == false) {
            return false;
        }
        GameInfo rhs = ((GameInfo) other);
        return new EqualsBuilder().append(name, rhs.name).append(jackpot, rhs.jackpot).append(date, rhs.date).isEquals();
    }

}
