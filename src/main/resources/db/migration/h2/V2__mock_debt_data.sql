INSERT INTO Debt (
    id,
    description,
    total_value,
    paid_value,
    discount_value,
    interest_value,
    fine_value,
    due_date,
    created_at,
    updated_at,
    deleted_at,
    status
) VALUES
(
    RANDOM_UUID(),
    'Mensalidade Janeiro',
    1000,
    0,
    0,
    0,
    0,
    DATE '2025-01-31',
    CURRENT_TIMESTAMP,
    NULL,
    NULL,
    'UNPAID'
),
(
    RANDOM_UUID(),
    'Mensalidade Fevereiro',
    1000,
    500,
    0,
    10,
    0,
    DATE '2025-02-28',
    CURRENT_TIMESTAMP,
    CURRENT_TIMESTAMP,
    NULL,
    'PARTIALLY_PAID'
);
