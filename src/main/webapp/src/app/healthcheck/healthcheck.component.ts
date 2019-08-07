import {Component, OnInit} from "@angular/core";
import {HealthcheckService} from "./healthcheck.service";
import {Healthcheck} from "./healthcheck";
import {Observable} from "rxjs";

@Component({
  selector: 'app-healthcheck',
  templateUrl: './healthcheck.component.html'
})

export class HealthcheckComponent implements OnInit {

  healthcheck: Observable<Healthcheck>;

  constructor(private healthcheckService: HealthcheckService) { }

  getHealthcheck(): void {
    this.healthcheckService.getHealthcheck().subscribe(healthcheck => {
      this.healthcheck = healthcheck;
    });
  }

  ngOnInit() {
    this.getHealthcheck();
  }

}
