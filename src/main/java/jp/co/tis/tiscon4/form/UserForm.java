package jp.co.tis.tiscon4.form;

import jp.co.tis.tiscon4.common.code.JobType;
import jp.co.tis.tiscon4.common.code.TreatedType;
import nablarch.core.util.StringUtil;
import nablarch.core.validation.ee.Domain;
import nablarch.core.validation.ee.Required;

import javax.validation.constraints.AssertTrue;
import java.io.Serializable;

public class UserForm implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 漢字氏名 */
    //@Required
    @Domain("kanjiName")
    private String kanjiName;

    //add 2 lines
    @Required
    @Domain("kanjiMyoji")
    private String kanjiMyoji;

    @Required
    @Domain("kanjiNamae")
    private String kanjiNamae;

    /** カナ氏名 */
    //@Required
    @Domain("kanaName")
    private String kanaName;

    @Required
    @Domain("kanaMyoji")
    private String kanaMyoji;

    @Required
    @Domain("kanaNamae")
    private String kanaNamae;

    /** 英字氏名 */
    //@Required
    @Domain("alphabetName")
    private String alphabetName;

    @Required
    @Domain("alphabetMyoji")
    private String alphabetMyoji;

    @Required
    @Domain("alphabetNamae")
    private String alphabetNamae;

    /** 性別 */
    @Required
    @Domain("gender")
    private String gender;

    /** 生年月日 */
    //@Required
    @Domain("dateOfBirth")
    private String dateOfBirth;

    @Required
    @Domain("dateOfBirthYear")
    private String dateOfBirthYear;

    @Required
    @Domain("dateOfBirthMonth")
    private String dateOfBirthMonth;

    @Required
    @Domain("dateOfBirthDay")
    private String dateOfBirthDay;

    /** 郵便番号 */
    @Required
    @Domain("zipCode")
    private String zipCode;

    /** 住所 */
    @Required
    @Domain("address")
    private String address;

    /** 自宅電話番号 */
    //@Required
    @Domain("homePhoneNumber")
    private String homePhoneNumber;

    @Required
    @Domain("homePhoneNumber1")
    private String homePhoneNumber1;

    @Required
    @Domain("homePhoneNumber2")
    private String homePhoneNumber2;

    @Required
    @Domain("homePhoneNumber3")
    private String homePhoneNumber3;

    /** 携帯電話番号 */
    //@Required
    @Domain("mobilePhoneNumber")
    private String mobilePhoneNumber;

    @Required
    @Domain("mobilePhoneNumber1")
    private String mobilePhoneNumber1;

    @Required
    @Domain("mobilePhoneNumber2")
    private String mobilePhoneNumber2;

    @Required
    @Domain("mobilePhoneNumber3")
    private String mobilePhoneNumber3;

    /** メールアドレス */
    //@Required
    @Domain("emailAddress")
    private String emailAddress;

    @Required
    @Domain("emailUser")
    private String emailUser;

    @Required
    @Domain("emailDomain")
    private String emailDomain;

    /** 配偶者有無 */
    @Required
    @Domain("married")
    private String married;

    /** 所得金額 */
    @Required
    @Domain("income")
    private String income;

    /** 職業 */
    @Required
    @Domain("job")
    private String job;

    /** その他の職業 */
    @Domain("otherJob")
    private String otherJob;

    /** 治療歴有無 */
    @Required
    @Domain("treated")
    private String treated;

    /** 既往歴 */
    @Domain("medicalHistory")
    private String medicalHistory;

    public UserForm() {
    }

    public String getKanjiName() {
        return kanjiName;
    }

    public void setKanjiName(String kanjiName) {
        this.kanjiName = kanjiName;
    }

    // add 2 lines
    public String getKanjiMyoji () {
        return kanjiMyoji;
    }

    public String getKanjiNamae () {
        return kanjiNamae;
    }

    public void setKanjiMyoji(String kanjiMyoji) {
        this.kanjiMyoji = kanjiMyoji;
    }

    public void setKanjiNamae(String kanjiNamae) {
        this.kanjiNamae = kanjiNamae;
    }

    public void setKanaMyoji(String kanaMyoji) {
       this.kanaMyoji = kanaMyoji;
    }

    public String getKanaMyoji() {
        return kanaMyoji;
    }


    public String getKanaNamae() {
        return kanaNamae;
    }

    public void setKanaNamae(String kanaNamae) {
        this.kanaNamae = kanaNamae;
    }

    public void setKanaName(String kanaName) {
        this.kanjiName = kanaName;
    }

    public String getKanaName() {
        return kanaName;
    }

    public String getAlphabetName() {
        return alphabetName;
    }

    public void setAlphabetName(String alphabetName) {
        this.alphabetName = alphabetName;
    }

    public String getAlphabetMyoji() {
        return alphabetMyoji;
    }

    public void setAlphabetMyoji(String alphabetMyoji) {
        this.alphabetMyoji = alphabetMyoji;
    }

    public String getAlphabetNamae() {
        return alphabetNamae;
    }

    public void setAlphabetNamae(String alphabetNamae) {
        this.alphabetNamae = alphabetNamae;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfBirthYear() {
        return dateOfBirthYear;
    }

    public void setDateOfBirthYear(String dateOfBirthYear) {
        this.dateOfBirthYear = dateOfBirthYear;
    }
    public String getDateOfBirthMonth() {
        return dateOfBirthMonth;
    }

    public void setDateOfBirthMonth(String dateOfBirthMonth) {
        this.dateOfBirthMonth = dateOfBirthMonth;
    }

    public String getDateOfBirthDay() {
        return dateOfBirthDay;
    }

    public void setDateOfBirthDay(String dateOfBirthDay) {
        this.dateOfBirthDay = dateOfBirthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getHomePhoneNumber1() {
        return homePhoneNumber1;
    }

    public void setHomePhoneNumber1(String homePhoneNumber1) {
        this.homePhoneNumber1 = homePhoneNumber1;
    }

    public String getHomePhoneNumber2() {
        return homePhoneNumber2;
    }

    public void setHomePhoneNumber2(String homePhoneNumber2) {
        this.homePhoneNumber2 = homePhoneNumber2;
    }

    public String getHomePhoneNumber3() {
        return homePhoneNumber3;
    }

    public void setHomePhoneNumber3(String homePhoneNumber3) {
        this.homePhoneNumber3 = homePhoneNumber3;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getMobilePhoneNumber1() {
        return mobilePhoneNumber1;
    }

    public void setMobilePhoneNumber1(String mobilePhoneNumber1) {
        this.mobilePhoneNumber1 = mobilePhoneNumber1;
    }

    public String getMobilePhoneNumber2() {
        return mobilePhoneNumber2;
    }

    public void setMobilePhoneNumber2(String mobilePhoneNumber2) {
        this.mobilePhoneNumber2 = mobilePhoneNumber2;
    }

    public String getMobilePhoneNumber3() {
        return mobilePhoneNumber3;
    }

    public void setMobilePhoneNumber3(String mobilePhoneNumber3) {
        this.mobilePhoneNumber3 = mobilePhoneNumber3;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getEmailDomain() {
        return emailDomain;
    }

    public void setEmailDomain(String emailDomain) {
        this.emailDomain = emailDomain;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getOtherJob() {
        return otherJob;
    }

    public void setOtherJob(String otherJob) {
        this.otherJob = otherJob;
    }

    public String getTreated() {
        return treated;
    }

    public void setTreated(String treated) {
        this.treated = treated;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    /**
     * その他の職業欄が正しく入力されているかどうか判定する。
     * 職業で「その他（有職）」を選択し、その他の職業欄に何らかの値が入力された場合、正しく入力されたと判定する。
     *
     * @return その他の職業欄に入力がある場合にtrue
     */
    @AssertTrue(message = "{tiscon4.order.inputUser.error.hasValueOtherJob}")
    public boolean hasValueOtherJob() {
        if (StringUtil.isNullOrEmpty(job)) {
            // 職業が未入力の場合は、相関バリデーションは実施しない。(バリデーションOKとする)
            return true;
        } else if (JobType.EMPLOYED.getCode().equals(job) && StringUtil.isNullOrEmpty(otherJob)) {
            return false;
        }
        return true;
    }

    /**
     * 既往歴が正しく入力されているかどうか判定する。
     * 治療有無で「はい」を選択し、既往歴に何らかの値が入力された場合、正しく入力されたと判定する。
     *
     * @return 既往歴に入力がある場合にtrue
     */
    @AssertTrue(message = "{tiscon4.order.inputUser.error.hasValueMedicalHistory}")
    public boolean hasValueMedicalHistory() {
        if (StringUtil.isNullOrEmpty(treated)) {
            // 治療有無が未入力の場合は、相関バリデーションは実施しない。(バリデーションOKとする)
            return true;
        } else if (TreatedType.TREATED.getCode().equals(treated) && StringUtil.isNullOrEmpty(medicalHistory)) {
            return false;
        }
        return true;
    }

}
