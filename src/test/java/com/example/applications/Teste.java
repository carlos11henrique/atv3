package com.example.applications;

import com.example.entities.Product;
import com.example.services.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class Teste {

    @InjectMocks
    ProductApplication pApk;

    @Mock

    ProductService service;

    @Test

    public void SalvarAImagemCorretamente() {

        Product produto = any(Product.class);
        pApk.append(produto);
        Mockito.verify(service, Mockito.times(1)).save(produto);
    }

    @Test

    public void RemoverAImagemCorretamente() {
        int productId = 1;

        pApk.remove(productId);

        Mockito.verify(service, Mockito.times(1)).remove(productId);
    }

    @Test

    public void AtualizarAImagemCorretamente() {
        Product produto = any(Product.class);
        pApk.update(1, produto);
        Mockito.verify(service, Mockito.times(1)).update(produto);
    }
}
