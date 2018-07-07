import {Embedded} from './embedded';
import {Link} from './link';

export class CustomerListResponse {
  constructor(public _embedded: Embedded, private _links: Link[]) {}
}
