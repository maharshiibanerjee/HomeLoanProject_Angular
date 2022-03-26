import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Application } from './application';

@Injectable({
  providedIn: 'root'
})
export class ApplicationService {

  constructor(private httpClient:HttpClient) { }

  baseUrl:string="http://localhost:9999";

  //RETRIEVING ALL PRODUCTS
  getApplication()

  {
    console.log("getApplication");
    return this.httpClient.get(this.baseUrl+"/displayApplications");  
  }

  public updateStatus(loanid:number, status: string){
    console.log("update status in httpclient"+loanid+status)
    return this.httpClient.put(this.baseUrl+"/loanStatus/"+loanid+"/" + status,"",{responseType: 'text'});
  }

  deleteApp(applicationid:number){
   return this.httpClient.delete(this.baseUrl+"/application/" +applicationid);
  }

  findApplication(applicationid:number){
    return this.httpClient.get(this.baseUrl+"/application/" +applicationid);
  }

  updateApplication(application:Application){
    return this.httpClient.put(this.baseUrl+"/application/" +application.loanId,application);
  }
}



