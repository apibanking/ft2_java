import javax.xml.ws.Holder;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext; 
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.math.BigInteger;
import java.util.UUID;

import java.util.ArrayList;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.net.URL;
import java.util.Iterator;

import javax.net.ssl.SSLContext;
import javax.net.ssl.KeyManagerFactory;
import java.security.KeyStore;
import java.io.FileInputStream;
import java.security.NoSuchAlgorithmException;
import java.security.KeyStoreException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.KeyManagementException;
import java.security.UnrecoverableKeyException;

import javax.xml.soap.SOAPException;
import javax.xml.ws.soap.SOAPFaultException;
import javax.xml.soap.SOAPFault;
import javax.xml.namespace.QName;
import javax.xml.soap.Detail;
import javax.xml.soap.DetailEntry;

import com.quantiguous.services.FundsTransferByCustomerService2;
import com.quantiguous.services.FundsTransferByCustomerService2HttpService;

import com.quantiguous.services.TransferTypeType;
import com.quantiguous.services.TransactionStatusType;
import com.quantiguous.services.BeneficiaryType;
import com.quantiguous.services.BeneficiaryDetailType;
import com.quantiguous.services.NameType;
import com.quantiguous.services.ContactType;
import com.quantiguous.services.AddressType;
import com.quantiguous.services.CurrencyCodeType;

import org.kohsuke.args4j.*;

class ApiBankingFault
{
   String faultCode;
   String faultSubCode;
   String faultReason;
}

@SuppressWarnings("unchecked")
public class FT2 {


   @Option(name="-?", usage="display this page")
   private boolean showUsage = false;
   
   @Option(name="-transferAmount", usage="the transferAmount")
   private float transferAmount = 10;
   
   @Option(name="-beneficiaryAccountNo", usage="the beneficiary Account No")
   private String beneficiaryAccountNo = "026291800001191";
   @Option(name="-beneficiaryIFSC", usage="the beneficiary Account IFSC")
   private String beneficiaryIFSC = "HDFC0000001";
   @Option(name="-beneficiaryMobileNo", usage="the beneficiary Mobile No")
   private String beneficiaryMobileNo = "9869581569";
   @Option(name="-beneficiaryMMID", usage="the beneficiary Account MMID")
   private String beneficiaryMMID = "9532870";

   public static void main(String[] argv) throws NoSuchAlgorithmException, KeyStoreException, FileNotFoundException, IOException, KeyStoreException, KeyStoreException, CertificateException, UnrecoverableKeyException, KeyManagementException {
     new FT2().doMain(argv);
  }
   public void doMain(String[] argv) throws NoSuchAlgorithmException, KeyStoreException, FileNotFoundException, IOException, KeyStoreException, KeyStoreException, CertificateException, UnrecoverableKeyException, KeyManagementException {
      CmdLineParser parser = new CmdLineParser(this);

      try {
          // parse the arguments.
          parser.parseArgument(argv);
          if( showUsage ) {
             parser.printUsage(System.err);
             System.err.println();
             return;
          }

      } catch( Exception e ) {
          parser.printUsage(System.err);
          System.err.println();
          return;
      }

      enableTrace();
      setClientCertificate();

      Path currentRelativePath = Paths.get("");
      String wsdlFilePath = currentRelativePath.toAbsolutePath().toString() + "/fundsTransferByCustomerService2.wsdl";

      FundsTransferByCustomerService2HttpService svc =  new FundsTransferByCustomerService2HttpService(new URL("file://" + wsdlFilePath));
      FundsTransferByCustomerService2 client = svc.getFundsTransferByCustomerService2HttpPort();
 

      Holder<String> version                          = new Holder<String>();
      Holder<TransferTypeType> transferType           = new Holder<TransferTypeType>();
      Holder<String> uniqueResponseNo                 = new Holder<String>();
      Holder<BigInteger> attemptNo                    = new Holder<BigInteger>();
      Holder<Boolean> lowBalanceAlert                 = new Holder<Boolean>();
      Holder<TransactionStatusType> transactionStatus = new Holder<TransactionStatusType>();
      Holder<String> nameWithBeneficiaryBank          = new Holder<String>();
      Holder<String> requestReferenceNo               = new Holder<String>();
      Holder<CurrencyCodeType> accountCurrencyCode    = new Holder<CurrencyCodeType>();
      Holder<Float>  accountBalanceAmount             = new Holder<Float>();

      BeneficiaryType beneficiary                     = new BeneficiaryType();
      BeneficiaryDetailType beneficiaryDetail         = new BeneficiaryDetailType();
      AddressType address                             = new AddressType();
      ContactType contact                             = new ContactType();
      NameType name                                   = new NameType();

      String uniqueRequestNo, appID, purposeCode, customerID, debitAccountNo, remitterToBeneficiaryInfo;
      CurrencyCodeType transferCurrencyCode;

      version.value                          = "1.0";
      uniqueRequestNo                        = String.valueOf(UUID.randomUUID()).replaceAll("-","");
      appID                                  = "299915";
      customerID                             = "299915";
      debitAccountNo                         = "000380800000781";
      transferType.value                     = TransferTypeType.NEFT;
      transferCurrencyCode                   = CurrencyCodeType.INR;
      transferAmount                         = transferAmount;
      remitterToBeneficiaryInfo              = "OnBoarding";
      purposeCode                            = null;
      
      address.setAddress1("Wilston Road");
      name.setFullName("Quantiguous Solutions");

      beneficiaryDetail.setBeneficiaryName(name);
      beneficiaryDetail.setBeneficiaryAddress(address);
      beneficiaryDetail.setBeneficiaryContact(contact);
      beneficiaryDetail.setBeneficiaryAccountNo(beneficiaryAccountNo);
      beneficiaryDetail.setBeneficiaryIFSC(beneficiaryIFSC);
      beneficiaryDetail.setBeneficiaryMobileNo(beneficiaryMobileNo);
      beneficiaryDetail.setBeneficiaryMMID(beneficiaryMMID);

      beneficiary.setBeneficiaryDetail(beneficiaryDetail);

      // set the url
      ((BindingProvider)client).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://uatsky.yesbank.in/app/uat/fundsTransferByCustomerService2");

      // set the user & password
      ((BindingProvider)client).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "testclient");
      ((BindingProvider)client).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "test@123");

      // set the headers
      Map<String, List<String>> headers = new HashMap<String, List<String>>();
      headers.put("X-IBM-Client-Id", Collections.singletonList("5bbc3c5c-6225-4935-8146-523b5883097a"));
      headers.put("X-IBM-Client-Secret", Collections.singletonList("bP7eY0fA7tW7nX7yE6oY8qD7tF3yL3fE4uK0pJ7cP3kE0mV8rF"));
      ((BindingProvider)client).getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, headers);

      // send the request
      try {
         client.transfer(version, uniqueRequestNo, appID, purposeCode, customerID, debitAccountNo, 
                         beneficiary, transferType, transferCurrencyCode, transferAmount, remitterToBeneficiaryInfo,
                         uniqueResponseNo, attemptNo, lowBalanceAlert, transactionStatus, nameWithBeneficiaryBank, requestReferenceNo
                        );

         parseTransferRestul(uniqueResponseNo, attemptNo, lowBalanceAlert, transferType, transactionStatus, nameWithBeneficiaryBank, requestReferenceNo);

         client.getBalance(version.value, appID, customerID, debitAccountNo, version, accountCurrencyCode, accountBalanceAmount, lowBalanceAlert);
      }
      catch(SOAPFaultException e) {
        printFault(e.getFault());
      }
      catch(Exception e) {
        e.printStackTrace(System.out); 
      };

      // set the url for 2 way ssl
//      ((BindingProvider)client).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://uatsky.yesbank.in:444/app/uat/fundsTransferByCustomerService2");
      ((BindingProvider)client).getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://uatsky.yesbank.in:444/app/uat/ssl/fundsTransferByCustomerSevice2");


      // generate new request no
      uniqueRequestNo                        = String.valueOf(UUID.randomUUID()).replaceAll("-","");

      // send the request
      try {
        client.transfer(version, uniqueRequestNo, appID, purposeCode, customerID, debitAccountNo, 
                        beneficiary, transferType, transferCurrencyCode, transferAmount, remitterToBeneficiaryInfo,
                        uniqueResponseNo, attemptNo, lowBalanceAlert, transactionStatus, nameWithBeneficiaryBank, requestReferenceNo
                       );
        
        parseTransferRestul(uniqueResponseNo, attemptNo, lowBalanceAlert, transferType, transactionStatus, nameWithBeneficiaryBank, requestReferenceNo);

        client.getBalance(version.value, appID, customerID, debitAccountNo, version, accountCurrencyCode, accountBalanceAmount, lowBalanceAlert);
      } 
      catch(SOAPFaultException e) {
        printFault(e.getFault());
      }
      catch (Exception e) {
        e.printStackTrace(System.out); 
      }
   }

   private void parseTransferRestul(Holder<String> uniqueResponseNo, 
                                           Holder<BigInteger> attemptNo, 
                                           Holder<Boolean>lowBalanceAlert, 
                                           Holder<TransferTypeType> transferType,
                                           Holder<TransactionStatusType> transactionStatus, 
                                           Holder<String> nameWithBeneficiaryBank, 
                                           Holder<String> requestReferenceNo) 
    {
     System.out.println("Transfer Type Used (when you pass ANY, the bank choses the transfer type)" + transferType.value);

     switch(transactionStatus.value.getStatusCode()) {
       case "COMPLETED":
         System.out.println("Transfer Completed (IMPS/FT)");
         System.out.println("RRN: " + transactionStatus.value.getBankReferenceNo());
         break;
       case "SENT_TO_BENEFICIARY":
         System.out.println("Funds sent to beneficiary bank, final status will be known after 2 hours (NEFT/RTGS)");
         System.out.println("UTR: " + transactionStatus.value.getBankReferenceNo());
         break;
       case "SCHEDULED_FOR_NEXT_WORKDAY":
         System.out.println("The transaction will be sent to the beneficiary bank the next working day, (NEFT/RTGS)");
         break;
       case "IN_PROCESS":
         System.out.println("The transaction is not yet processed, can pass or fail, status will be known after 30 mins");
         break;
       case "RETURNED_FROM_BENEFICIARY":
         System.out.println("The funds sent to the beneficiary bank have been returned (NEFT/RTGS)");
         System.out.println("Return Code: " + transactionStatus.value.getSubStatusCode());
         System.out.println("Return Reason: " + transactionStatus.value.getReason());
         break;
       case "FAILED":
         System.out.println("The transaction failed");
         System.out.println("Failure Code: " + transactionStatus.value.getSubStatusCode());
         System.out.println("Failure Reason: " + transactionStatus.value.getReason());
         break;
     }

   }

   private String parseQName(QName val) {
      if ( val != null ) {
         if ( val.getNamespaceURI() == "http://www.quantiguous.com/services" ) {
            return "ns:" + val.getLocalPart();
         }
         return val.toString();
      }
      return null;
   }

   private ApiBankingFault parseFault(SOAPFault f) {
      boolean first = false;
      ApiBankingFault apiFault = new ApiBankingFault();

      for (Iterator<QName> subCodesIterator = (Iterator<QName>)f.getFaultSubcodes(); subCodesIterator.hasNext();) {
         if (first == false) { 
            apiFault.faultCode = parseQName(subCodesIterator.next());
            first = true;
         } else {
           apiFault.faultSubCode = parseQName(subCodesIterator.next());
         }
      }
      try {
         for (Iterator<String> reasonTextsIterator = (Iterator<String>)f.getFaultReasonTexts(); reasonTextsIterator.hasNext();) {
            apiFault.faultReason = reasonTextsIterator.next();
         }
      } catch (SOAPException x) {
         x.printStackTrace(System.out); 
      }
      if ( f.hasDetail() ) {
         for (Iterator<DetailEntry> detailEntriesIterator = (Iterator<DetailEntry>)f.getDetail().getDetailEntries(); detailEntriesIterator.hasNext();) {
            System.out.println(detailEntriesIterator.next());
         }
      }
 
      return apiFault;
   }

   private void printFault(SOAPFault f) {
      ApiBankingFault apiFault = parseFault(f);

      System.out.println(apiFault.faultCode);
      System.out.println(apiFault.faultSubCode);
      System.out.println(apiFault.faultReason);
   }

   private void enableTrace() {
     System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
     System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
     System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
     System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
   }

   private void setClientCertificate() {
     System.setProperty("javax.net.ssl.keyStore", "qg-client.jks");
     System.setProperty("javax.net.ssl.keyStorePassword", "apibanking");
   }


   /* the following method doesnt work with the oracle jdk, it may work when this runs within an app-server, 
      the idea is to find out where is JAXWSProperties */
   private void setSocketFactory(BindingProvider client) 
      throws NoSuchAlgorithmException, KeyStoreException, FileNotFoundException, IOException, KeyStoreException, KeyStoreException, CertificateException, UnrecoverableKeyException, KeyManagementException {
      SSLContext sc = SSLContext.getInstance("TLS");
      KeyManagerFactory factory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
      KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
      keyStore.load(new FileInputStream("qg-client.jks"), "apibanking".toCharArray());
      factory.init(keyStore, "apibanking".toCharArray());
      sc.init(factory.getKeyManagers(), null, null);

      // specify a SSLSocket factory that will deal wit hthe 2 way SSL
      ((BindingProvider)client).getRequestContext().put("com.sun.xml.ws.developer.JAXWSProperties.SSL_SOCKET_FACTORY", sc);
      ((BindingProvider)client).getRequestContext().put("com.sun.xml.internal.ws.developer.JAXWSProperties.SSL_SOCKET_FACTORY", sc);
   }
}
