import { Component, OnInit } from '@angular/core';
import { CustomerBO } from '../customer/customerBO';
import { Router, ActivatedRoute } from '@angular/router';
import { CustomerService } from '../customer/customer.service';
import { HttpClient } from '@angular/common/http';
import {CustomerListResponse} from '../customer/customerListResponse';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
  providers: [CustomerService, HttpClient]
})
export class HomeComponent implements OnInit {

  public customerList: CustomerBO[];
  private customerListResponse: CustomerListResponse;
  constructor(private _router: Router, private customerService: CustomerService) {
  }
  ngOnInit() {
    this.customerService.getCustomerLit().subscribe(
      res => {
        console.log(res);
        this.customerListResponse = res;
        this.customerList = this.customerListResponse._embedded.Customer;
        console.log(this.customerList);
      });
  }
  viewCustomer(customerIndex) {
    this._router.navigate(['viewCustomer', customerIndex]);
  }
  editCustomer(customerIndex) {
    this._router.navigate(['editCustomer', customerIndex]);
  }
  deleteCustomer(customerIndex) {
  }
}
