import { Component, OnInit } from '@angular/core';
import { ApplicationService } from '../application.service';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-admindash',
  templateUrl: './admindash.component.html',
  styleUrls: ['./admindash.component.css']
})
export class AdmindashComponent implements OnInit {
  [x: string]: any;

  constructor(private applicationService:ApplicationService, private loginService:LoginService) { }
  app1:any;
    account?:any;

    ngOnInit(): void {
    this.getAllApplications(); 
   
  }
  
  getAllApplications(){
    this.applicationService.getApplication().subscribe((data: any)=>{
      console.log(data);
      this.app1=data;
      console.log(this.app1);
    })
  }

  deleteRow(applicationid:any){
    alert(applicationid)
    this['applicationService'].deleteApp(applicationid).subscribe((data: any)=>{
      console.log(data);
    })
    this['router'].navigate(['admin'])
  }

  CreateAccount(ap?:any) 
   {
      this['applicationService'].updateApplication(ap).subscribe((data: any)=>
      {
        console.log(data);

        this.getAllApplications(); 
        this['router'].navigate(['application']);})
     }
 
     public updateStatus(loanId: number, status: string){
       console.log("update status call")
       this.loginService.updateloan(loanId,status).subscribe();
     }


}
