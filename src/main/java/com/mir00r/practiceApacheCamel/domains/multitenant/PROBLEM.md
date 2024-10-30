### **API Gateway with Multi-Tenant Support**
**Problem Statement**: A large organization provides an API gateway for multiple tenants (clients).
Each tenant has different security requirements, rate limits, and request validation rules.
The API gateway must be able to dynamically handle these configurations based on the incoming request.

**Solution**:
- Use Camel routes with `Content-Based Routing` to route API requests based on the tenant.
- Implement dynamic rate-limiting using Camel’s `Throttler` pattern, customizing limits per tenant.
- Use Camel’s `SSL` and `JWT` components to ensure tenant-specific authentication and authorization.
- Transform incoming requests to the required format using `DataFormat` and forward them to the appropriate backend service.
