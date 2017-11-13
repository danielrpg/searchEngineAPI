import { ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

//componets
 import { LoginComponent } from './login/login.component';
 import { HomeComponent } from './home/home.component';

 const appRoutes = [
     { path:'', component:LoginComponent },
     { path:'', redirectTo:'login', pathMatch:'full' },
     { path:'login', component:LoginComponent },
     { path:'home', component:HomeComponent }

 ];

 export const appRoutingProviders: any[] = [];
 export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);
