import {Link} from './link';

export class CustomerBO {
  constructor(private id: number, private name: String, private phoneNumber: String, private emailId: String,
              private address: String, private lastUpdateTS: number, private _links: Link) {}
}
