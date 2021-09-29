package ng.okra.api.Auth.Requests;

import ng.okra.api.Common.Requests.PaginatedRequest;

/**
 * The type Retrieve auth as pdf request.
 */
public class RetrieveAuthAsPdfRequest extends PaginatedRequest {
    /**
     * The Pdf.
     */
    public boolean Pdf = true;

    /**
     * Is pdf boolean.
     *
     * @return the boolean
     */
    public boolean isPdf() {
        return Pdf;
    }

    /**
     * Sets pdf.
     *
     * @param pdf the pdf
     */
    public void setPdf(boolean pdf) {
        Pdf = pdf;
    }

    @Override
    public String toString() {
        return "RetrieveAuthAsPdfRequest{" +
                "Pdf=" + Pdf +
                '}';
    }
}
