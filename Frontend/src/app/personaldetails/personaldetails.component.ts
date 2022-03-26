import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Route, Router } from '@angular/router';
import { LoginService } from '../login.service';
import { User } from '../user';

@Component({
  selector: 'app-personaldetails',
  templateUrl: './personaldetails.component.html',
  styleUrls: ['./personaldetails.component.css']
})
export class PersonaldetailsComponent implements OnInit {
  

  user = new User();

  User=new FormGroup({

    username:new FormControl("",[Validators.required]),
    firstName:new FormControl("",[Validators.required]),
    lname:new FormControl("",[Validators.required]),
    mname:new FormControl(),
    EmailId:new FormControl("",[Validators.required,Validators.pattern("^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$")]),
    password:new FormControl("", [Validators.required, Validators.pattern("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&].{8,}")]),
    ConfirmPassword:new FormControl("", [Validators.required]),
    PhoneNumber:new FormControl("", [Validators.required, Validators.pattern("^((\\+91-?)|0)?[0-9]{10}$")]),
    DateOfBirth:new FormControl("",[Validators.required]),
    Gender:new FormControl("",[Validators.required]),
    Nationality:new FormControl(null,[Validators.required]),
    AadharNumber:new FormControl(null,[Validators.required,Validators.pattern("^[0-9]{12}$")]),
    PanNumber:new FormControl(null,[Validators.required]),
  }
  );

  constructor(private _service : LoginService, private _route : Router) { }

  
  ngOnInit(): void { }
  get username()
  {
    return this.User.get('userName');
  }

  get firstName()
  {
    return this.User.get('firstName');
  }

  get mname()
  {
    return this.User.get('middleName');
  }
  get lname()
  {
    return this.User.get('lastName');
  }
  get EmailId()
  {
    return this.User.get('emailId');
  }
  get PhoneNumber()
  {
    return this.User.get('phoneNumber');
  }
  get password()
  {
    return this.User.get('password');
  }
  get ConfirmPassword()
  {
     return this.User.get('ConfirmPassword');
  }  
  get Nationality()
  {
    return this.User.get('Nationality');
  }
  get AadharNumber()
  {
    return this.User.get('AadharNumber');
  }
  get PanNumber()
  {
    return this.User.get('PanNumber');
  }
  get DateOfBirth()
  {
    return this.User.get('DateOfBirth');
  }
  get Gender()
  {
    return this.User.get('Gender');
  }

  register(){
     
       this._service.register(this.user).subscribe(
        data => {
          console.log("regisatered success")
          this._route.navigate(['/customerlogin'])

         },
        error => console.log("egisatered failure")
          )
       
     

  }

}
