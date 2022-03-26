import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RouterModule } from "@angular/router";
import { AppRoutingModule } from "./app-routing.module";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})


export class AppComponent implements OnInit {
  message!:boolean
  
  ngOnInit(): void {
    console.log("status="+this.message)
    if(sessionStorage.getItem('USERNAME')!=null || sessionStorage.getItem('ADMINUSERNAME')!=null){
      this.message=true;
    }
    
  }
  title = 'mainhomeloan';
  logout()
  {
    console.log("hi");
    sessionStorage.removeItem('USERNAME');
    sessionStorage.removeItem('ADMINUSERNAME');
    sessionStorage.clear();
   
  } 
}
