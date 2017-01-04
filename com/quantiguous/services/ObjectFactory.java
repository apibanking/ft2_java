
package com.quantiguous.services;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.quantiguous.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DebitAccountNo_QNAME = new QName("http://www.quantiguous.com/services", "debitAccountNo");
    private final static QName _Beneficiary_QNAME = new QName("http://www.quantiguous.com/services", "beneficiary");
    private final static QName _UniqueRequestNo_QNAME = new QName("http://www.quantiguous.com/services", "uniqueRequestNo");
    private final static QName _BeneficiaryName_QNAME = new QName("http://www.quantiguous.com/services", "beneficiaryName");
    private final static QName _AppID_QNAME = new QName("http://www.quantiguous.com/services", "appID");
    private final static QName _Supplier_QNAME = new QName("http://www.quantiguous.com/services", "supplier");
    private final static QName _NameWithBeneficiaryBank_QNAME = new QName("http://www.quantiguous.com/services", "nameWithBeneficiaryBank");
    private final static QName _LowBalanceAlert_QNAME = new QName("http://www.quantiguous.com/services", "lowBalanceAlert");
    private final static QName _CustomerID_QNAME = new QName("http://www.quantiguous.com/services", "customerID");
    private final static QName _AttemptNo_QNAME = new QName("http://www.quantiguous.com/services", "attemptNo");
    private final static QName _TransferType_QNAME = new QName("http://www.quantiguous.com/services", "transferType");
    private final static QName _TransactionStatus_QNAME = new QName("http://www.quantiguous.com/services", "transactionStatus");
    private final static QName _BeneficiaryAccountNo_QNAME = new QName("http://www.quantiguous.com/services", "beneficiaryAccountNo");
    private final static QName _UniqueResponseNo_QNAME = new QName("http://www.quantiguous.com/services", "uniqueResponseNo");
    private final static QName _Version_QNAME = new QName("http://www.quantiguous.com/services", "version");
    private final static QName _RequestReferenceNo_QNAME = new QName("http://www.quantiguous.com/services", "requestReferenceNo");
    private final static QName _TransferAmount_QNAME = new QName("http://www.quantiguous.com/services", "transferAmount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.quantiguous.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link SupplierType }
     * 
     */
    public SupplierType createSupplierType() {
        return new SupplierType();
    }

    /**
     * Create an instance of {@link TransferResponse }
     * 
     */
    public TransferResponse createTransferResponse() {
        return new TransferResponse();
    }

    /**
     * Create an instance of {@link TransactionStatusType }
     * 
     */
    public TransactionStatusType createTransactionStatusType() {
        return new TransactionStatusType();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link PayInvoice }
     * 
     */
    public PayInvoice createPayInvoice() {
        return new PayInvoice();
    }

    /**
     * Create an instance of {@link InvoiceType }
     * 
     */
    public InvoiceType createInvoiceType() {
        return new InvoiceType();
    }

    /**
     * Create an instance of {@link Transfer }
     * 
     */
    public Transfer createTransfer() {
        return new Transfer();
    }

    /**
     * Create an instance of {@link BeneficiaryType }
     * 
     */
    public BeneficiaryType createBeneficiaryType() {
        return new BeneficiaryType();
    }

    /**
     * Create an instance of {@link GetBalance }
     * 
     */
    public GetBalance createGetBalance() {
        return new GetBalance();
    }

    /**
     * Create an instance of {@link PayInvoiceResponse }
     * 
     */
    public PayInvoiceResponse createPayInvoiceResponse() {
        return new PayInvoiceResponse();
    }

    /**
     * Create an instance of {@link GetBalanceResponse }
     * 
     */
    public GetBalanceResponse createGetBalanceResponse() {
        return new GetBalanceResponse();
    }

    /**
     * Create an instance of {@link ContactType }
     * 
     */
    public ContactType createContactType() {
        return new ContactType();
    }

    /**
     * Create an instance of {@link PayOrderType }
     * 
     */
    public PayOrderType createPayOrderType() {
        return new PayOrderType();
    }

    /**
     * Create an instance of {@link SupplierDetailType }
     * 
     */
    public SupplierDetailType createSupplierDetailType() {
        return new SupplierDetailType();
    }

    /**
     * Create an instance of {@link BeneficiaryDetailType }
     * 
     */
    public BeneficiaryDetailType createBeneficiaryDetailType() {
        return new BeneficiaryDetailType();
    }

    /**
     * Create an instance of {@link PayOrdersType }
     * 
     */
    public PayOrdersType createPayOrdersType() {
        return new PayOrdersType();
    }

    /**
     * Create an instance of {@link TaxesAppliedArray }
     * 
     */
    public TaxesAppliedArray createTaxesAppliedArray() {
        return new TaxesAppliedArray();
    }

    /**
     * Create an instance of {@link TaxDeductedAtSourceType }
     * 
     */
    public TaxDeductedAtSourceType createTaxDeductedAtSourceType() {
        return new TaxDeductedAtSourceType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link TaxAppliedItem }
     * 
     */
    public TaxAppliedItem createTaxAppliedItem() {
        return new TaxAppliedItem();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "debitAccountNo")
    public JAXBElement<String> createDebitAccountNo(String value) {
        return new JAXBElement<String>(_DebitAccountNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BeneficiaryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "beneficiary")
    public JAXBElement<BeneficiaryType> createBeneficiary(BeneficiaryType value) {
        return new JAXBElement<BeneficiaryType>(_Beneficiary_QNAME, BeneficiaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "uniqueRequestNo")
    public JAXBElement<String> createUniqueRequestNo(String value) {
        return new JAXBElement<String>(_UniqueRequestNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "beneficiaryName")
    public JAXBElement<NameType> createBeneficiaryName(NameType value) {
        return new JAXBElement<NameType>(_BeneficiaryName_QNAME, NameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "appID")
    public JAXBElement<String> createAppID(String value) {
        return new JAXBElement<String>(_AppID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "supplier")
    public JAXBElement<SupplierType> createSupplier(SupplierType value) {
        return new JAXBElement<SupplierType>(_Supplier_QNAME, SupplierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "nameWithBeneficiaryBank")
    public JAXBElement<String> createNameWithBeneficiaryBank(String value) {
        return new JAXBElement<String>(_NameWithBeneficiaryBank_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "lowBalanceAlert")
    public JAXBElement<Boolean> createLowBalanceAlert(Boolean value) {
        return new JAXBElement<Boolean>(_LowBalanceAlert_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "customerID")
    public JAXBElement<String> createCustomerID(String value) {
        return new JAXBElement<String>(_CustomerID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "attemptNo")
    public JAXBElement<BigInteger> createAttemptNo(BigInteger value) {
        return new JAXBElement<BigInteger>(_AttemptNo_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferTypeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "transferType")
    public JAXBElement<TransferTypeType> createTransferType(TransferTypeType value) {
        return new JAXBElement<TransferTypeType>(_TransferType_QNAME, TransferTypeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "transactionStatus")
    public JAXBElement<TransactionStatusType> createTransactionStatus(TransactionStatusType value) {
        return new JAXBElement<TransactionStatusType>(_TransactionStatus_QNAME, TransactionStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "beneficiaryAccountNo")
    public JAXBElement<String> createBeneficiaryAccountNo(String value) {
        return new JAXBElement<String>(_BeneficiaryAccountNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "uniqueResponseNo")
    public JAXBElement<String> createUniqueResponseNo(String value) {
        return new JAXBElement<String>(_UniqueResponseNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "version")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(_Version_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "requestReferenceNo")
    public JAXBElement<String> createRequestReferenceNo(String value) {
        return new JAXBElement<String>(_RequestReferenceNo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.quantiguous.com/services", name = "transferAmount")
    public JAXBElement<Float> createTransferAmount(Float value) {
        return new JAXBElement<Float>(_TransferAmount_QNAME, Float.class, null, value);
    }

}
