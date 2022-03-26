import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { PersonaldetailsComponent } from './personaldetails/personaldetails.component';
import { CustomerloginComponent } from './customerlogin/customerlogin.component';
import { IncomedetailsComponent } from './incomedetails/incomedetails.component';
import { FaqComponent } from './faq/faq.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdmindashComponent } from './admindash/admindash.component';
import { LoandetailsComponent } from './loandetails/loandetails.component';
import { FormsModule } from '@angular/forms';


const routes: Routes = [
  {path:'',component:DashboardComponent},
  {path:'home',component:DashboardComponent},
{path:'aboutus',component:AboutusComponent},
{path:'personaldetails',component:PersonaldetailsComponent},
{path:'customerlogin', component: CustomerloginComponent},
{path:'adminlogin',component:AdminloginComponent},
{path:'admindash',component:AdmindashComponent},
{path:'incomedetails', component:IncomedetailsComponent},
{path:'faq',component: FaqComponent},
{path:"calculator",component:CalculatorComponent},
{path:"loandetails",component:LoandetailsComponent}
];
  
@NgModule({
  imports: [RouterModule.forRoot(routes),FormsModule],
  exports: [RouterModule]
  
  

})
export class AppRoutingModule { }
