import {ModuleWithProviders} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {ViewCustomerComponent} from './customer/view-customer/view-customer.component';
import {AddCustomerComponent} from './customer/add-customer/add-customer.component';
import {EditCustomerComponent} from './customer/edit-customer/edit-customer.component';
// import {BookGuard } from './book.guard';
import {PageNotFoundComponent} from './shared/page-not-found/page-not-found.component';
import {HomeComponent} from './home/home.component';

const appRoutes: Routes =
  [
    {
      path: '',
      component: HomeComponent
    },
    {
      path: 'addCustomer',
      component: AddCustomerComponent
    },
    {
      path: 'editCustomer/:id',
      component: EditCustomerComponent
    },
    {
      path: 'viewCustomer/:id',
      component: ViewCustomerComponent
    },
    {
      path: '**',
      component: PageNotFoundComponent
    }
  ]

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);
