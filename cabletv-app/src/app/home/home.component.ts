import { Component, OnInit, OnDestroy } from '@angular/core';
import {Router, ActivatedRoute} from '@angular/router';
// import {Subscription} from 'rxjs/Rx';

@Component({
  selector: 'home',
  templateUrl: './home.component.html',
  styles: []
})

export class HomeComponent implements OnInit, OnDestroy {
  public customers: Customer [] = [
    {
      'Id': 100,
      'Name': 'Chitra',
      'PhoneNumber': '9952897661',
      'Address': '153 Anna Nagar, Kancheepuram',
      'NoOfConnections' : 1,
      'ConnectionCreatedDate' : 152662684,
      'DepositeAmount' : 500,
      'DueAmount' : 0
    },
    {
      'Id': 400,
      'Name': 'Harish',
      'PhoneNumber': '9003369782',
      'Address': '153 Anna Nagar, Kancheepuram',
      'NoOfConnections' : 2,
      'ConnectionCreatedDate' : 1526862684,
      'DepositeAmount' : 500,
      'DueAmount' : 125
    }
  ];
  constructor(private _router: Router) {
  }
  onclick(i) {
    this._router.navigate(['viewcustomer' , i ]);
  }
  ngOnInit() {
  }
  ngOnDestroy() {
  }
}

export class Customer {
  Id: number;
  Name: string;
  PhoneNumber: string;
  Address: string;
  NoOfConnections: number;
  ConnectionCreatedDate: number;
  DepositeAmount: number;
  DueAmount: number;
}
