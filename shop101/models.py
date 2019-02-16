from django.db import models
from django.contrib.auth.models import User

# Create your models here.
class Product(models.Model):
    product_name = models.CharField(max_length=100)
    price = models.IntegerField(default=0)
    description = models.TextField()
    brand = models.CharField(max_length=50)
    image_url = models.TextField()

class Cart(models.Model):
    user_id = models.ForeignKey(User, on_delete=models.CASCADE)
    product_id = models.ForeignKey(Product, on_delete = models.CASCADE)
    on_added = models.DateTimeField(auto_now_add=True)
