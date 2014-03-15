/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore_assignment4.app;


import com.lisa.gamingrentalstore_assignment4.services.crud.CashierCrudService;
import com.lisa.gamingrentalstore_assignment4.services.crud.ContractsCrudService;
import com.lisa.gamingrentalstore_assignment4.services.crud.CustomerAccountCrudService;
import com.lisa.gamingrentalstore_assignment4.services.crud.CustomerCrudService;
import com.lisa.gamingrentalstore_assignment4.services.crud.CustomerDetailsCrudService;
import com.lisa.gamingrentalstore_assignment4.services.crud.DemographicCrudService;
import com.lisa.gamingrentalstore_assignment4.services.crud.FinesCrudService;
import com.lisa.gamingrentalstore_assignment4.services.crud.GameCategoryCrudService;
import com.lisa.gamingrentalstore_assignment4.services.crud.GameReviewCrudService;
import com.lisa.gamingrentalstore_assignment4.services.crud.GamesComingSoonCrudService;
import com.lisa.gamingrentalstore_assignment4.services.crud.GamesCrudService;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.CashierCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.ContractsCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.CustomerAccountCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.CustomerCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.CustomerDetailsCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.DemographicCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.FinesCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.GameCategoryCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.GameReviewCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.GamesComingSoonCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.GamesCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.InventoryCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.ManagerCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.OrderCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.PaymentTypeCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.RentalLogCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.RentalSalesCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.StoreInfoCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.UserRolesCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.Impl.UsersCrudServiceImpl;
import com.lisa.gamingrentalstore_assignment4.services.crud.InventoryCrudService;
import com.lisa.gamingrentalstore_assignment4.services.crud.ManagerCrudService;
import com.lisa.gamingrentalstore_assignment4.services.crud.OrderCrudService;
import com.lisa.gamingrentalstore_assignment4.services.crud.PaymentTypeCrudService;
import com.lisa.gamingrentalstore_assignment4.services.crud.RentalLogCrudService;
import com.lisa.gamingrentalstore_assignment4.services.crud.RentalSalesCrudService;
import com.lisa.gamingrentalstore_assignment4.services.crud.StoreInfoCrudService;
import com.lisa.gamingrentalstore_assignment4.services.crud.UserRolesCrudService;
import com.lisa.gamingrentalstore_assignment4.services.crud.UsersCrudService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
/**
 *
 * @author Lisa
 */
@Configurable
public class AppConfig {
    @Bean(name = "cashierCrudService")
    public  CashierCrudService getCashierCrudService(){
        return new CashierCrudServiceImpl();
    }
    
    @Bean(name = "contractsCrudService")
    public  ContractsCrudService getContractsCrudService(){
        return new ContractsCrudServiceImpl();
    }
    
      @Bean(name = "customerCrudService")
    public  CustomerCrudService getCustomerCrudService(){
        return new CustomerCrudServiceImpl();
    }
    
    @Bean(name = "customerAccountCrudService")
    public  CustomerAccountCrudService getCustomerAccountCrudService(){
        return new CustomerAccountCrudServiceImpl();
    }
    
    @Bean(name = "customerDetailsCrudService")
    public  CustomerDetailsCrudService getCustomerDetailsCrudService(){
        return new CustomerDetailsCrudServiceImpl();
    }
    
     @Bean(name = "demographicCrudService")
    public  DemographicCrudService getDemographicCrudService(){
        return new DemographicCrudServiceImpl();
    }
    
     @Bean(name = "finesCrudService")
    public  FinesCrudService getFinesCrudService(){
        return new FinesCrudServiceImpl();
    }
    
     @Bean(name = "gameCategoryCrudService")
    public  GameCategoryCrudService getGameCategoryCrudService(){
        return new GameCategoryCrudServiceImpl();
    }
    
     @Bean(name = "gameReviewCrudService")
    public  GameReviewCrudService getGameReviewCrudService(){
        return new GameReviewCrudServiceImpl();
    }
    
     @Bean(name = "gamesCrudServie")
    public  GamesCrudService getGamesCrudService(){
        return new GamesCrudServiceImpl();
    }
    
     @Bean(name = "gamesComingSoonCrudService")
    public  GamesComingSoonCrudService getGamesComingSoonCrudService(){
        return new GamesComingSoonCrudServiceImpl();
    }
    
     @Bean(name = "inventoryCrudService")
    public  InventoryCrudService getInventoryCrudService(){
        return new InventoryCrudServiceImpl();
    }
    
     @Bean(name = "managerCrudService")
    public  ManagerCrudService getManagerCrudService(){
        return new ManagerCrudServiceImpl();
    }
    
     @Bean(name = "orderCrudService")
    public  OrderCrudService getOrderCrudService(){
        return new OrderCrudServiceImpl();
    }
    
     @Bean(name = "paymentTypeCrudService")
    public  PaymentTypeCrudService getPaymentTypeCrudService(){
        return new PaymentTypeCrudServiceImpl();
    }
    
     @Bean(name = "rentalLogCrudService")
    public  RentalLogCrudService getRentalLogCrudService(){
        return new RentalLogCrudServiceImpl();
    }
    
     @Bean(name = "rentalSalesCrudService")
    public  RentalSalesCrudService getRentalSalesCrudService(){
        return new RentalSalesCrudServiceImpl();
    }
    
     @Bean(name = "storeInfoCrudService")
    public  StoreInfoCrudService getStoreInfoCrudService(){
        return new StoreInfoCrudServiceImpl();
    }
    
     @Bean(name = "userRolesCrudService")
    public  UserRolesCrudService getUserRolesCrudService(){
        return new UserRolesCrudServiceImpl();
    }
    
     @Bean(name = "usersCrudService")
    public  UsersCrudService getUsersCrudService(){
        return new UsersCrudServiceImpl();
    }
}
