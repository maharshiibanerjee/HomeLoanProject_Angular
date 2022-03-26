import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { PersonaldetailsComponent } from './personaldetails/personaldetails.component';
import { CustomerloginComponent } from './customerlogin/customerlogin.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { IncomedetailsComponent } from './incomedetails/incomedetails.component';
import { FaqComponent } from './faq/faq.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdmindashComponent } from './admindash/admindash.component';
import { LoandetailsComponent } from './loandetails/loandetails.component';
import { EmicalculatorComponent } from './emicalculator/emicalculator.component';
import { EligibilitycalculatorComponent } from './eligibilitycalculator/eligibilitycalculator.component';



@NgModule({
  declarations: [
    AppComponent,
   
    AboutusComponent,
    PersonaldetailsComponent,
    CustomerloginComponent,
    IncomedetailsComponent,
    FaqComponent,
    DashboardComponent,
    CalculatorComponent,
    AdminloginComponent,
    AdmindashComponent,
    LoandetailsComponent,
    EmicalculatorComponent,
    EligibilitycalculatorComponent
    
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule,
   
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
