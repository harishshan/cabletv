import { CustomerBO } from './customerBO';
import { Link } from './link';

export class Embedded {
  constructor(public Customer: CustomerBO[]) {}
}
