import javax.xml.ws.Holder;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext; 
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Collections;
import java.math.BigInteger;
import java.util.UUID;

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


public class FT2 {
   public static void main(String[] argv) {
      enableTrace();

      FundsTransferByCustomerService2HttpService svc =  new FundsTransferByCustomerService2HttpService();
      FundsTransferByCustomerService2 client = svc.getFundsTransferByCustomerService2HttpPort();
 

      Holder<String> version                          = new Holder<String>();
      Holder<TransferTypeType> transferType           = new Holder<TransferTypeType>();
      Holder<String> uniqueResponseNo                 = new Holder<String>();
      Holder<BigInteger> attemptNo                    = new Holder<BigInteger>();
      Holder<Boolean> lowBalanceAlert                 = new Holder<Boolean>();
      Holder<TransactionStatusType> transactionStatus = new Holder<TransactionStatusType>();
      Holder<String> nameWithBeneficiaryBank          = new Holder<String>();
      Holder<String> requestReferenceNo               = new Holder<String>();

      BeneficiaryType beneficiary                     = new BeneficiaryType();
      BeneficiaryDetailType beneficiaryDetail         = new BeneficiaryDetailType();
      AddressType address                             = new AddressType();
      ContactType contact                             = new ContactType();
      NameType name                                   = new NameType();

      String uniqueRequestNo, appID, purposeCode, customerID, debitAccountNo, remitterToBeneficiaryInfo;
      CurrencyCodeType transferCurrencyCode;
      float transferAmount;


      version.value                          = "1.0";
      uniqueRequestNo                        = String.valueOf(UUID.randomUUID()).replaceAll("-","");
      appID                                  = "299915";
      customerID                             = "299915";
      debitAccountNo                         = "000380800000781";
      transferType.value                     = TransferTypeType.ANY;
      transferCurrencyCode                   = CurrencyCodeType.INR;
      transferAmount                         = 100;
      remitterToBeneficiaryInfo              = "OnBoarding";
      purposeCode                            = null;
      
      address.setAddress1("Wilston Road");
      name.setFullName("Quantiguous Solutions");

      beneficiaryDetail.setBeneficiaryName(name);
      beneficiaryDetail.setBeneficiaryAddress(address);
      beneficiaryDetail.setBeneficiaryContact(contact);
      beneficiaryDetail.setBeneficiaryAccountNo("026291800001191");
      beneficiaryDetail.setBeneficiaryIFSC("HDFC0000001");
      beneficiaryDetail.setBeneficiaryMobileNo("9869581569");
      beneficiaryDetail.setBeneficiaryMMID("9532870");

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

   
      client.transfer(version, uniqueRequestNo, appID, purposeCode, customerID, debitAccountNo, 
                      beneficiary, transferType, transferCurrencyCode, transferAmount, remitterToBeneficiaryInfo,
                      uniqueResponseNo, attemptNo, lowBalanceAlert, transactionStatus, nameWithBeneficiaryBank, requestReferenceNo
                     );

      System.out.println("hello world");
   }

   private static void enableTrace() {
     System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump", "true");
     System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump", "true");
     System.setProperty("com.sun.xml.ws.transport.http.HttpAdapter.dump", "true");
     System.setProperty("com.sun.xml.internal.ws.transport.http.HttpAdapter.dump", "true");
   }
}
