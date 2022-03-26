import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from './user';
import { Incomedetails } from './incomedetails';
import { LoanDetails } from './loan-details';
@Injectable({
  providedIn: 'root'
})
export class LoginService {
 apiServer = "http://localhost:9999"
  constructor(private _http : HttpClient) { 

  }

  public loginUserFromRemote(user : User) : Observable<any>{

    return this._http.post<any>("http://localhost:9999/loginUser",user)

  }
   public register(user:User): Observable<any>{
     return this._http.post<any>("http://localhost:9999/savePersonalDetail",user)
   }
 
  public GetLoanDetails():Observable<LoanDetails[]>{return this._http.get<LoanDetails[]>(this.apiServer+'/LoanDetails/display')}

  public loandetails(loandetails:any):Observable<any>{
    return this._http.post(this.apiServer+'/saveLoan',loandetails,{  responseType: 'text'})
    
  }
  
  public updateloan(loanId:number, status: string):Observable<any>{
    console.log("update in httpclient");
    let url = this.apiServer+'/loanStatus'+"/"+loanId+"/"+status;
    console.log(url)
        return this._http.put(url,url,{  responseType: 'text'})
    
  }
   public incomeDetails(income: Incomedetails):Observable<any> {
    //const headers = new HttpHeaders().set('Content-Type', 'text/plain; charset=utf-8');
    //return this.http.get(this.url,{ headers, responseType: 'text'});
    return this._http.post("http://localhost:9999/saveIncome",income,{  responseType: 'text'})

   }

}
