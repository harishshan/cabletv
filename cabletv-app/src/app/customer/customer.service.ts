import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse} from '@angular/common/http';
import { Observable } from 'rxjs/Observable';
import { ErrorObservable } from 'rxjs/observable/ErrorObservable';
import { catchError, retry } from 'rxjs/operators';
import { CustomerBO } from './customerBO';
import {CustomerListResponse} from './customerListResponse';

@Injectable()
export class CustomerService {

  private customerUrl  = 'http://localhost:8080/Customer';

  constructor(private httpClient: HttpClient) { }
  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type':  'application/json',
      /*'Authorization': 'my-auth-token'*/
    })
  };

/*  private handleError(error: HttpErrorResponse) {
    if (error.error instanceof ErrorEvent) {
      // A client-side or network error occurred. Handle it accordingly.
      console.error('An error occurred:', error.error.message);
    } else {
      // The backend returned an unsuccessful response code.
      // The response body may contain clues as to what went wrong,
      console.error(
        `Backend returned code ${error.status}, ` +
        `body was: ${error.error}`);
    }
    // return an ErrorObservable with a user-facing error message
    return new ErrorObservable(
      'Something bad happened; please try again later.');
  }*/

  addCustomer (customer: CustomerBO): Observable<CustomerBO> {
    return this.httpClient.post<CustomerBO>(this.customerUrl, customer, this.httpOptions)
      .pipe(
        /*catchError(/!*this.handleError*!/)*/
      );
  }
  getCustomerLit(): Observable<any> {
    return this.httpClient.get(this.customerUrl);
  }
}
