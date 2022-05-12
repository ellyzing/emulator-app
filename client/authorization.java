public class AuthCallout {
 
    public void basicAuthCallout(){
      HttpRequest req = new HttpRequest();
      req.setEndpoint("http://ib19-4.com");
      req.setMethod("GET");
      
      // Specify the required user name and password to access the endpoint
      // As well as the header and header information
  
      String username = "myname";
      String password = "mypwd";
   
      Blob headerValue = Blob.valueOf(username + ':' + password);
      String authorizationHeader = "Basic " +
      EncodingUtil.base64Encode(headerValue);
      req.setHeader("Authorization", authorizationHeader);
    
      // Create a new http object to send the request object
      // A response object is generated as a result of the request  
   
      Http http = new Http();
      HTTPResponse res = http.send(req);
      System.debug(res.getBody());
    }
 }
