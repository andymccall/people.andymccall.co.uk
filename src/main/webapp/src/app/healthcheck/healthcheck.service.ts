import { Injectable } from '@angular/core';
import {Healthcheck} from "./healthcheck";
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable, throwError} from "rxjs";

@Injectable({
  providedIn: 'root',
})
export class HealthcheckService {

  public healthcheck: Healthcheck;

  constructor(private http: HttpClient) {}

  getHealthcheck(): Observable<any> {

    return this.http.get('http://localhost:8080/api/healthcheck');

  }

}


