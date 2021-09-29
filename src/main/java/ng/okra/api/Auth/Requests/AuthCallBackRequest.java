package ng.okra.api.Auth.Requests;

import ng.okra.api.Common.Requests.CallBackRequestTypes;

/**
 * The type Auth call back request.
 */
public class AuthCallBackRequest {

    /**
     * The Record.
     */
    public String Record;
    /**
     * The Method.
     */
    public String Method = CallBackRequestTypes.AUTH;

    /**
     * Gets record.
     *
     * @return the record
     */
    public String getRecord() {
        return Record;
    }

    /**
     * Sets record.
     *
     * @param record the record
     */
    public void setRecord(String record) {
        Record = record;
    }

    /**
     * Gets method.
     *
     * @return the method
     */
    public String getMethod() {
        return Method;
    }

    /**
     * Sets method.
     *
     * @param method the method
     */
    public void setMethod(String method) {
        Method = method;
    }

    @Override
    public String toString() {
        return "AuthCallBackRequest{" +
                "Record='" + Record + '\'' +
                ", Method='" + Method + '\'' +
                '}';
    }
}
