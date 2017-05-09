package com.ufidstudios.igt.gamestatus.model.valueobjects;

import java.io.Serializable;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlayerInfo implements Serializable, Parcelable
{

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("balance")
    @Expose
    private Integer balance;
    @SerializedName("avatarLink")
    @Expose
    private String avatarLink;
    @SerializedName("lastLogindate")
    @Expose
    private String lastLogindate;
    public final static Parcelable.Creator<PlayerInfo> CREATOR = new Creator<PlayerInfo>() {


        @SuppressWarnings({
                "unchecked"
        })
        public PlayerInfo createFromParcel(Parcel in) {
            PlayerInfo instance = new PlayerInfo();
            instance.name = ((String) in.readValue((String.class.getClassLoader())));
            instance.balance = ((Integer) in.readValue((Integer.class.getClassLoader())));
            instance.avatarLink = ((String) in.readValue((String.class.getClassLoader())));
            instance.lastLogindate = ((String) in.readValue((String.class.getClassLoader())));
            return instance;
        }

        public PlayerInfo[] newArray(int size) {
            return (new PlayerInfo[size]);
        }

    }
            ;
    private final static long serialVersionUID = -5100597893318362632L;

    /**
     * No args constructor for use in serialization
     *
     */
    public PlayerInfo() {
    }

    /**
     *
     * @param balance
     * @param lastLogindate
     * @param name
     * @param avatarLink
     */
    public PlayerInfo(String name, Integer balance, String avatarLink, String lastLogindate) {
        super();
        this.name = name;
        this.balance = balance;
        this.avatarLink = avatarLink;
        this.lastLogindate = lastLogindate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerInfo withName(String name) {
        this.name = name;
        return this;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public PlayerInfo withBalance(Integer balance) {
        this.balance = balance;
        return this;
    }

    public String getAvatarLink() {
        return avatarLink;
    }

    public void setAvatarLink(String avatarLink) {
        this.avatarLink = avatarLink;
    }

    public PlayerInfo withAvatarLink(String avatarLink) {
        this.avatarLink = avatarLink;
        return this;
    }

    public String getLastLogindate() {
        return lastLogindate;
    }

    public void setLastLogindate(String lastLogindate) {
        this.lastLogindate = lastLogindate;
    }

    public PlayerInfo withLastLogindate(String lastLogindate) {
        this.lastLogindate = lastLogindate;
        return this;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(name);
        dest.writeValue(balance);
        dest.writeValue(avatarLink);
        dest.writeValue(lastLogindate);
    }

    public int describeContents() {
        return 0;
    }

}