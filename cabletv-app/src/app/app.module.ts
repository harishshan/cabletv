import { BrowserModule } from '@angular/platform-browser';
import { NgModule, CUSTOM_ELEMENTS_SCHEMA} from '@angular/core';
import { AppComponent } from './app.component';
import { NavbarComponent } from './shared/navbar/navbar.component';
import { PageNotFoundComponent } from './shared/page-not-found/page-not-found.component';
import { AddCustomerComponent } from './customer/add-customer/add-customer.component';
import { EditCustomerComponent } from './customer/edit-customer/edit-customer.component';
import { ViewCustomerComponent } from './customer/view-customer/view-customer.component';
import { HomeComponent} from './home/home.component';
import {routing} from './app.routing';
import { ConnectionComponent } from './customer/connection/connection.component';
import { HsLabelComponent } from './component/hs-label/hs-label.component';
import { HsInputTextComponent } from './component/hs-input-text/hs-input-text.component';
import { HsLabelInputTextComponent } from './component/hs-label-input-text/hs-label-input-text.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    PageNotFoundComponent,
    AddCustomerComponent,
    EditCustomerComponent,
    ViewCustomerComponent,
    HomeComponent,
    ConnectionComponent,
    HsLabelComponent,
    HsInputTextComponent,
    HsLabelInputTextComponent
  ],
  imports: [
    BrowserModule, routing, FormsModule, ReactiveFormsModule, HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent],
  schemas: [ CUSTOM_ELEMENTS_SCHEMA]
})
export class AppModule { }
