import { Component, OnInit } from '@angular/core';
import { Route, Router } from '@angular/router';
import { Incomedetails } from '../incomedetails';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-incomedetails',
  templateUrl: './incomedetails.component.html',
  styleUrls: ['./incomedetails.component.css']
})
export class IncomedetailsComponent implements OnInit {
  [x: string]: any;

  income= new Incomedetails("RR");
  constructor(private _service : LoginService,private _route : Router) { 
    
    //this.income.userName=sessionStorage.getItem('username')==null?"":sessionStorage.getItem('username')
    
    this.income.userName=sessionStorage.getItem('username')!
    console.log("Move:"+sessionStorage.getItem('username'))
    }

  ngOnInit(): void {
    console.log("Move:"+sessionStorage.getItem('username'))
    this.income.userName=sessionStorage.getItem('username')!
  }
saveIncome(){
  console.log("Income" + "" + this.income)
  this._service.incomeDetails(this.income).subscribe(
    
 
    data => {
      console.log("Income saved success")
      this._route.navigate(['/loandetails']) 
    },
    error => console.log(error)
   
      )
}
}
