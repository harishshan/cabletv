import { Component, OnInit } from '@angular/core';
import {CustomerService} from '../customer.service';
import {CustomerBO} from '../customerBO';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css'],
  providers: [CustomerService, HttpClient]
})
export class AddCustomerComponent implements OnInit {

  public customer: CustomerBO;
  public name: string;
  public phoneNumber: string;
  public emailId: string;
  public address: string;
  constructor(public customerService: CustomerService) {}


  ngOnInit() {
  }

  createCustomer() {
    console.log('Create Customer Method');
    this.customer = new CustomerBO(null, this.name, this.phoneNumber, this.emailId, this.address, null, null);
    this.customerService.addCustomer(this.customer)
      .subscribe(customer => console.log(customer));
  }

}
