import { Routes,RouterModule } from '@angular/router';
import { ListitemComponent } from './listitem/listitem.component';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { AuthguardService } from './service/authguard.service';

const appRoutes : Routes = [
    { path : 'login', component: LoginComponent },
    { path : 'index',  component: HomeComponent, canActivate : [AuthguardService],
    children :[
        { path: '', redirectTo:'login', pathMatch:'full' },
        { path : 'listitem', component: ListitemComponent, canActivate:[AuthguardService]}
    ]},

    { path:'*', redirectTo:'/login'}
];

export const routing = RouterModule.forRoot(appRoutes);