import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { NavbarComponent } from './shared/navbar/navbar.component';
import { PageNotFoundComponent } from './shared/page-not-found/page-not-found.component';
import { AddCustomerComponent } from './customer/add-customer/add-customer.component';
import { EditCustomerComponent } from './customer/edit-customer/edit-customer.component';
import { ViewCustomerComponent } from './customer/view-customer/view-customer.component';
import { HomeComponent} from './home/home.component';
import {routing} from './app.routing';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    PageNotFoundComponent,
    AddCustomerComponent,
    EditCustomerComponent,
    ViewCustomerComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule, routing
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
