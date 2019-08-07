import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HealthcheckComponent} from "./healthcheck/healthcheck.component";
import {HomepageComponent} from "./homepage/homepage.component";


const routes: Routes = [
  { path: '', component: HomepageComponent},
  { path: 'healthcheck', component: HealthcheckComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
