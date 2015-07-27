package za.co.ebridge.isup.api.message.parameter;

public interface GenericDigits
        extends ISUPParameter
{
    int _PARAMETER_CODE = 0xC1;

    /**
     * See Q.763 3.24 Encoding scheme : BCD even: (even number of digits)
     */
    int _ENCODING_SCHEME_BCD_EVEN = 0;

    /**
     * See Q.763 3.24 Encoding scheme : BCD odd: (odd number of digits)
     */
    int _ENCODING_SCHEME_BCD_ODD = 1;

    /**
     * See Q.763 3.24 Encoding scheme : IA5 character
     */
    int _ENCODING_SCHEME_IA5 = 2;

    /**
     * See Q.763 3.24 Encoding scheme : binary coded
     */
    int _ENCODING_SCHEME_BINARY = 3;

    /**
     * See Q.763 3.24 Type of digits : reserved for account code
     */
    int _TOD_ACCOUNT_CODE = 0;

    /**
     * See Q.763 3.24 Type of digits : reserved for authorisation code
     */
    int _TOD_AUTHORIZATION_CODE = 1;

    /**
     * See Q.763 3.24 Type of digits : reserved for private networking travelling class mark
     */
    int _TOD_PNTCM = 2;

    /**
     * See Q.763 3.24 Type of digits : reserved for business communication group identity
     */
    int _TOD_BGCI = 3;

    int getEncodingScheme();

    void setEncodingScheme(int encodingScheme);

    int getTypeOfDigits();

    void setTypeOfDigits(int typeOfDigits);

    byte[] getEncodedDigits();

    void setEncodedDigits(byte[] digits);

    // TODO: add public String getDecodedDigits() ;
    // TODO: add public void setDecodedDigits(int encodingScheme, String digits) ;
}
