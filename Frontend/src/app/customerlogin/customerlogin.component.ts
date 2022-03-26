import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { FormsModule }   from '@angular/forms';
import { LoginService } from '../login.service';
import { User } from '../user';
import { Route, Router } from '@angular/router';

@Component({
  selector: 'app-customerlogin',
  templateUrl: './customerlogin.component.html',
  styleUrls: ['./customerlogin.component.css']
})
export class CustomerloginComponent implements OnInit {

  user = new User();
  msg = ''


  constructor(private _service : LoginService, private _route : Router) { }

  ngOnInit(): void {
  }

  login(){
    this._service.loginUserFromRemote(this.user).subscribe(
  data =>{
    console.log("response received")
    this.msg = "Successful Login";
    this._route.navigate(['/home'])

  },
  error =>{
    console.log("exception occured")
    this.msg = "User doesn't Exist, Please Enter Valid Details";
  }
    )
    }

}

